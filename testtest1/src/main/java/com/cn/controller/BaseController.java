package com.cn.controller;

import com.cn.entity.SysUser;
import com.cn.utils.BaseResponse;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\24 0024 16:43
 * @Description:
 */
public class BaseController {

    @Value("${success.deal}")
    public String DEAL_SUCCESS;
    @Value("${fail.deal}")
    public String DEAL_FAIL;
    @Value("${success.save}")
    public String SAVE_SUCCESS;
    @Value("${fail.save}")
    public String SAVE_FAIL;
    @Value("${success.update}")
    public String UPDATE_SUCCESS;
    @Value("${fail.update}")
    public String UPDATE_FAIL;
    @Value("${success.delete}")
    public String DELETE_SUCCESS;
    @Value("${fail.delete}")
    public String DELETE_FAIL;
    @Value("${success.find}")
    public String FIND_SUCCESS;
    @Value("${fail.find}")
    public String FIND_FAIL;
    @Value("${success.quit}")
    public String QUIT_SUCCESS;
    @Value("${fail.login}")
    public String LOGIN_FAIL;
    @Value("${success.login}")
    public String LOGIN_SUCCESS;
    @Value("${unknown.account}")
    public String UNKNOWN_ACCOUNT;
    @Value("${incorrect.password}")
    public String INCORRECT_PASSWORD;
    @Value("${account.locked}")
    public String ACCOUNT_LOCKED;
    @Value("${too.many.mistakes}")
    public String TOO_MANY_MISTAKES;
    @Value("${username.or.password.incorrect}")
    public String USERNAME_OR_PASSWORD_INCORRECT;
    @Value("${privilege.grant.failed}")
    public String PRIVILEGE_GRANT_FAILED;
    @Value("${reset.password}")
    public String RESET_PASSWORD;
    @Value("${default.role.name}")
    public String DEFAULT_ROLE_NAME;
    public static final String SUCCESS_CODE = "200";
    public static final String FAIL_CODE = "300";
    public static final String INSERT_ROLE = "^{2,10}+$";
    public static final String USER_LOGIN = "^[a-zA-Z_\\d]{2,20}$";
    public static final String PASSWORD_LOGIN = "^[a-z][a-z_0-9]{5,19}$";
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    public static final String REGEX_MOBILE = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$";
    public static final String REGEX_SORT = "^\\d*$";
    public static final String SESSION_USER = "system_user";
    public static final Integer PAGE_SIZE = 20;

    public BaseController() {
    }

    public SysUser getUser(HttpServletRequest request) {
        return (SysUser)request.getSession().getAttribute("system_user");
    }

    public BaseResponse ajaxSucc(Object data, String desc, String code) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(code);
        baseResponse.setDesc(desc);
        baseResponse.setTime((new Date()).getTime() + "");
        baseResponse.setData(data);
        return baseResponse;
    }

    public BaseResponse ajaxSucc(Object data, Integer totalRecord, String desc, String code) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(code);
        baseResponse.setDesc(desc);
        baseResponse.setTime((new Date()).getTime() + "");
        baseResponse.setData(data);
        baseResponse.setTotalRecord(totalRecord);
        return baseResponse;
    }

    public BaseResponse ajaxFail(Object desc, String code) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(code);
        baseResponse.setDesc(desc);
        baseResponse.setData("{}");
        baseResponse.setTime((new Date()).getTime() + "");
        return baseResponse;
    }

    public BaseResponse ajaxSucc(Object data, String desc, String code, Page page) {
        Map<String, Object> result = new HashMap();
        result.put("data", data);
        result.put("total", page.getTotal());
        result.put("pages", page.getPages());
        result.put("pageNum", page.getPageNum());
        result.put("pageSize", page.getPageSize());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(code);
        baseResponse.setDesc(desc);
        baseResponse.setTime((new Date()).getTime() + "");
        baseResponse.setData(result);
        return baseResponse;
    }

    public Map<String, Object> getResult(Object object, com.cn.page.Page page) {
        Map<String, Object> result = new HashMap();
        result.put("data", object);
        result.put("totalRecord", page.getTotalRecord());
        result.put("currentPage", page.getCurrentPage());
        result.put("pageSize", page.getPageSize());
        return result;
    }
}
