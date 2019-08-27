package com.rain.javaweb.login.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-27 上午9:29
 */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化完成");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //获取当前请求是谁
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String uri = request.getRequestURI();
        String url = request.getRequestURL().toString();

        System.out.println("URI: " + uri);
        System.out.println("URL: " + url);
        //判断要过滤的请求
        if (url.endsWith("/index.jsp")|| url.endsWith("/")) {
            //过滤  引导去往登录页面
            response.sendRedirect("login.jsp");
        } else {
            //放行 继续执行后续操作,如果有过滤器，执行下一个过滤器，保证后面是用的是同一个request，response
            filterChain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
