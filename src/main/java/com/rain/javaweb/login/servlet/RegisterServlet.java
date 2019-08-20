package com.rain.javaweb.login.servlet;

import com.rain.javaweb.login.beans.User;
import com.rain.javaweb.login.dao.UserDao;
import com.rain.javaweb.login.dao.UserDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: StudyJava
 * @description: 注册功能
 * @author: rainboz
 * @create: 2019-08-20 19:43
 **/
public class RegisterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 输入信息后提交--->一个注册的Servlet通过request对象获取用户名、密码--->调用Dao插入到数据库中
         */
        //1.获取用户提交信息
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //2.判断用户名是否可用
        UserDao userDao = new UserDaoImpl();
        User user = userDao.getUserByUsername(username);
        if (user != null) {
            //注册失败返回到注册页面，并进行提示！
            //转发
            req.setAttribute("register_msg", "用户名已经存在！");
            RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
            rd.forward(req, resp);

        } else {
            //可以注册
            //3.将用户信息更新至数据库
            userDao.insertUser(user);
            //注册成功返回到登录页面
            resp.sendRedirect("login.jsp");
        }
    }
}
