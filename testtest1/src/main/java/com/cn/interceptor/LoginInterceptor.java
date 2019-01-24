package com.cn.interceptor;

import com.cn.entity.SysUser;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\24 0024 17:13
 * @Description:
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    public LoginInterceptor() {
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("请求地址：" + request.getRequestURI());
        SysUser sysUser = (SysUser)request.getSession().getAttribute("system_user");
        if (sysUser != null) {
            System.out.println("用户名：" + sysUser.getUser_name());
            return true;
        } else {
            if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
                response.setCharacterEncoding("UTF-8");
                response.setContentType("text/xml");
                response.setDateHeader("Expires", 0L);
                response.setHeader("sessionstatus", "timeout");
            } else {
                response.sendRedirect(request.getContextPath() + "/cms/login.html");
            }

            return false;
        }
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
