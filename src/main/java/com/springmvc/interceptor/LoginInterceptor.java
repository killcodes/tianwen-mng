package com.springmvc.interceptor;

import com.alibaba.fastjson.JSON;
import com.springmvc.common.ErrorInfo;
import com.springmvc.dao.entity.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截校验登录信息
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("user");
        if (userInfo == null){
            String xRequested =request.getHeader("X-Requested-With");
            if("XMLHttpRequest".equals(xRequested)){
                response.getWriter().write(JSON.toJSONString(new ErrorInfo(null, "no-auth")));
            }else{
                response.sendRedirect("/");
            }
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
