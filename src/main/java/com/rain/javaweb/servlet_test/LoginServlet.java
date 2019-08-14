package com.rain.javaweb.servlet_test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @progrom StudyJava
 * @Description TODO 处理登录请求的Servlet | Servlet是sun公司制定的标准  tomcat(Web应用服务器、Servlet容器)实现了这些标准 | HttpServlet：
 * @Author rainboz
 * @Date 2019-08-14 下午7:07
 */
public class LoginServlet extends HttpServlet {
    /**
     * 常用的方法：doGet doPost service
     * doGet:处理客户端的get方式的请求
     * doPost:处理客户端的post方式的请求
     *
     * service:根据具体的请求方式去调用对应的doGet、doPost方法
     *
     * 要么重写doGet、doPost方法，完成相互之间的调用
     * 要么重写service方法就可以了
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //登录功能的实现：doGet调用，可以互相调用，只能有一个方法
        System.out.println("登录请求过来了");

    }

  /*  @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }*/
}
