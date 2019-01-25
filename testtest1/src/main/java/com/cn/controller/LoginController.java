package com.cn.controller;

import com.cn.utils.BaseResponse;
import com.cn.vcode.Captcha;
import com.cn.vcode.GifCaptcha;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\23 0023 14:20
 * @Description:
 */
@RestController
@RequestMapping
public class LoginController extends BaseController{

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

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

        System.out.println("denglu");
        return null;
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
