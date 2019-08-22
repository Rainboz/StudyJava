package com.rain.javaweb.login.servlet;

import com.google.gson.Gson;
import com.rain.javaweb.login.beans.Student;
import com.rain.javaweb.login.dao.StudentDao;
import com.rain.javaweb.login.dao.StudentDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-22 下午4:51
 */
@WebServlet(name = "StudentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询student列表
        StudentDao studentDao = new StudentDaoImpl();
        List<Student> studentList = studentDao.getStudentList();
        if (studentList.size() == 0) {
            System.out.println("没有学生信息");
            request.setAttribute("stu_msg", "没有学生信息");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            response.setContentType("text/html;charset=utf-8");
            /**
             * 通过gson转将student对象转为json对象
             * 1.把list或对象转化为json
             */
            Gson gson = new Gson();
            String str = gson.toJson(studentList);
            response.getWriter().println(str);
            System.out.println(str);

        }
    }

}
