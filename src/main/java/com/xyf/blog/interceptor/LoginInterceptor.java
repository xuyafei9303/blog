package com.xyf.blog.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    // 预处理
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user") == null) { // 未登录
            response.sendRedirect("/admin");
            return false; // 不放行
        }
        return true; // 放行
    }
}
