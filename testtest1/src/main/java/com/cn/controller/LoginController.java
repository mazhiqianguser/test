package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\23 0023 14:20
 * @Description:
 */
@Controller
@RequestMapping("login")
public class LoginController {


    @RequestMapping("getLogin")
    @ResponseBody
    public String getLogin(){

        return null;
    }

}
