package com.rain.javaweb.servlet_test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
     * <p>
     * service:根据具体的请求方式去调用对应的doGet、doPost方法
     * <p>
     * 要么重写doGet、doPost方法，完成相互之间的调用
     * 要么重写service方法就可以了
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //登录功能的实现：doGet调用，可以互相调用，只能有一个方法
        System.out.println("登录请求过来了");

        /**
         * HttpServletRequest: 请求对象，Servlet容器会在请求到达后，创建一个request对象，
         *                      将请求相关的信息全部封装到该对象中
         */
        req.setCharacterEncoding("utf-8");

        //获取到用户输入的用户名和密码，进行登录业务的处理
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + "--" + password);

        System.out.println("Admin".equalsIgnoreCase(username));
        System.out.println("550320023".equals(password));

        //验证密码

        //通过响应对象HttpServletResponse，给客户端响应数据
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        if ("Admin".equalsIgnoreCase(username) && "550320023".equals(password)) {
            //登录成功

            out.println("<h1><font color='green'>Login success!登录成功</font></h1>");

            System.out.println("Login success!登录成功");
        }else {
            out.println("<h1><font color='green'>Login Failed!登录失败</font></h1>");

            System.out.println("Login Failed!登录失败");
        }
    }

  /*  @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }*/
}
