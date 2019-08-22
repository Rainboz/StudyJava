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
import java.lang.reflect.Method;
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
        /*//1. 获取ServletPath
        String url = request.getServletPath();

        //2. 去除/和.do
        String methodName = url.substring(1);
        methodName = methodName.substring(0,methodName.length()-3);*/


        String url = request.getRequestURI();
        String methodName = url.substring(url.lastIndexOf("/")+1,url.lastIndexOf("."));
        Method method =null;

        try {
            System.out.println(url);
            System.out.println(methodName);
            //3. 利用反射获取methodName对应的方法:这里用private声明方法,使用getDeclaredMethod()
            method = getClass().getDeclaredMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);

            //4. 利用反射调用对应方法
            method.invoke(this,request,response);

        } catch (Exception e) {
            throw new RuntimeException("调用方法出错！");
        }
    }
    private void getStudentList(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
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
    private void deleteStu(HttpServletRequest request, HttpServletResponse response) {
        //获取ajax删除请求携带的参数
        String method = request.getParameter("method");
        String stuId = request.getParameter("stuId");
        StudentDao studentDao = new StudentDaoImpl();
        int i = studentDao.deteleStudent(Integer.parseInt(stuId));
        if (i == 1){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

}
