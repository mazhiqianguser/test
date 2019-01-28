package com.cn.controller;

import cn.com.cintel.cin.commons.security.Md5Utils;
import com.cn.entity.SysUser;
import com.cn.service.SysUserService;
import com.cn.utils.BaseResponse;
import com.cn.utils.MD5Util;
import com.cn.vcode.Captcha;
import com.cn.vcode.GifCaptcha;
import com.cn.vcode.VerifyCodeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.util.StringUtils;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\23 0023 14:20
 * @Description:
 */
@RestController
@RequestMapping
public class LoginController extends BaseController{

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    @Resource
    private SysUserService sysUserService;

    public LoginController() {
    }

    @PostMapping(
            value = {"/login"},
            produces = {"application/json;charset=utf-8"}
    )
    @ResponseBody
    public BaseResponse login(HttpServletRequest request,
                              @RequestParam String username,
                              @RequestParam String password,
                              @RequestParam("vcode") String vcode){


        /*登陆做判断*/
        /*验证用户名 密码不为空*/
        if(!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)){
            String pwd = MD5Util.getPwd(password);
            SysUser user = this.sysUserService.getUsername(username);
            if(user!=null && !user.equals("")){
                if(!username.equals(user.getUser_name())){
                    return this.ajaxFail(USERNAME_NO_AGREEMENT,"300");
                }else if (!pwd.equals(user.getPassword())){
                    return this.ajaxFail(PASSWORD_NO_AGREEMENT,"300");
                }else if (user.getStatus() == 0){
                    return this.ajaxFail(USERNAME_LOCKING, "300");
                }else if (!VerifyCodeUtils.verifyCode(request,vcode)){
                    return this.ajaxFail(VERIFICATION_CODE_ERROR, "300");
                }
                return this.ajaxSucc("", this.LOGIN_SUCCESS, "200");
            }else {
                return ajaxFail(USERNAME_NON,"300");
            }
        }
        return this.ajaxFail(USERNAME_PASSWORD_NULL, "300");
    }

    /**
     * @Author mazhiqiang
     * @Description //TODO 获取验证码
     * @Date 16:37 2019\1\24 0024
     * @Param
     * @return
     **/

    @RequestMapping(value = "/getGifCode")
    public void getGifCode(HttpServletResponse response, HttpServletRequest request){
        try {
            /*通过session获取元素*/
            HttpSession session = request.getSession();
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0L);
            response.setContentType("image/gif");
            Captcha captcha = new GifCaptcha(146, 42, 4);
            ServletOutputStream out = response.getOutputStream();
            captcha.out(out);
            out.flush();
            session.setAttribute("_CODE", captcha.text().toLowerCase());
        }catch (Exception e){
            log.error("获取验证码异常：%s", e.getMessage());
        }
    }
}
