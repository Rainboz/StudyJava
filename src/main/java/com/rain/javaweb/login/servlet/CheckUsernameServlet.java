package com.rain.javaweb.login.servlet;

import com.rain.javaweb.login.beans.User;
import com.rain.javaweb.login.dao.UserDao;
import com.rain.javaweb.login.dao.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-21 上午11:31
 */
public class CheckUsernameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //业务：获取用户名
        String username = request.getParameter("username");

        UserDao userDao = new UserDaoImpl();
        User user = userDao.getUserByUsername(username);
        String msg = "";
        if (user == null) {
            //可用
            msg = "0";
        } else {
            msg = "1";
        }

        response.setContentType("text/html;charset=utf-8");
        //跟var msg = xhr.responseText;对应
        response.getWriter().println(msg);

    }
}
