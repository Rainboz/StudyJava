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
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        /**
         * 输入信息后提交--->一个注册的Servlet通过request对象获取用户名、密码--->调用Dao插入到数据库中
         */
        //1.获取用户提交信息
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //2.判断用户名是否可用
        UserDao userDao = new UserDaoImpl();
        User user = userDao.getUserByUsername(username);
        System.out.println("1username: "+username+" "+"1password: "+password);

        if (user != null) {
            //注册失败返回到注册页面，并进行提示！
            //转发
            req.setAttribute("register_msg", "用户名已经存在！");
            RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
            rd.forward(req, resp);

        } else {
            //可以注册
            //3.将用户信息更新至数据库
            /**
             * [BUG]:一直空指针异常 ps.setString(1, user.getUsername());
             * [原因]:该条件下，user对象一直为null，并没有将用户子表单输入的值传到user中
             * 通过userDao.insertUser(String username,String password);恰好避开了这一问题
             * 传user对象的话要先通过User中的setUsername(username);再去执行sql
             * ps.setString(1, user.getUsername());通过getUsername()获取刚才set的值。
             *
             * [重要]:user对象是用来判断用户名是否存在,为null可以注册，不能使用该对象传递表单的值
             * 在该条件下重新创建一个User对象user1,用来保存用户提交的信息.
             */
            User user1 = new User();
            user1.setUsername(username);
            user1.setPassword(password);
            userDao.insertUser(user1);
            //注册成功返回到登录页面
            resp.sendRedirect("login.jsp");
        }
    }
}
