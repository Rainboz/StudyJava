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
        //1. 获取ServletPath
        String method = request.getServletPath();

        //2. 去除/和.do
        //(此时处理的请求是查询 query.do)
        System.out.println("request.getServletPath()获取的值为: " + method);
        //2.通过字符串截取，把方法名 query 截取出来
        method = method.substring(1, method.length()-3);

        System.out.println("截取后的值为： "+ method);

/*
        String url = request.getRequestURI();
        String methodName = url.substring(url.lastIndexOf("/")+1,url.lastIndexOf("."));*/
        Method m =null;

        try {
            //3. 利用反射获取methodName对应的方法:这里用private声明方法,使用getDeclaredMethod()
            m = this.getClass().getDeclaredMethod(method,HttpServletRequest.class,HttpServletResponse.class);

            //4. 利用反射调用对应方法
            m.invoke(this,request,response);

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
    private void deleteStu(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
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
    private void updateStu(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
        int stuId = Integer.parseInt(request.getParameter("stuId"));
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        int age = Integer.parseInt(request.getParameter("age"));
        String phone = request.getParameter("phone");

        Student student = new Student(stuId,name,sex,age,phone);
        StudentDao studentDao = new StudentDaoImpl();
        int i = studentDao.updateStudent(student);
        String msg_update = "";
        if (i == 0){
            System.out.println("更新失败");
            msg_update = "0";
            response.getWriter().println(msg_update);
        }else {
            System.out.println("更新成功11111111");
            msg_update = "1";
            System.out.println(student.toString());
            response.getWriter().println(msg_update);
        }
    }
    private void selectByStuId(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
        StudentDao studentDao = new StudentDaoImpl();

        int stuId  = Integer.parseInt(request.getParameter("stuId"));
        Student student = studentDao.selectByStuId(stuId);

        //格式JSON
        Gson gson = new Gson();
        String s = gson.toJson(student);

        //设置响应编码,防止中文乱码
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(s);
        System.out.println(s);
    }

    private void selectById(HttpServletRequest request ,HttpServletResponse response){
        System.out.println("selectById");
    }
    private void addStudent(HttpServletRequest request ,HttpServletResponse response)throws IOException, ServletException{
        Student stu1 = new Student();
        StudentDao studentDao = new StudentDaoImpl();
        int stuId = Integer.parseInt(request.getParameter("stuId"));
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        int age = Integer.parseInt(request.getParameter("age"));
        String phone = request.getParameter("phone");

        stu1.setStuId(stuId);
        stu1.setName(name);
        stu1.setSex(sex);
        stu1.setAge(age);
        stu1.setPhone(phone);
        boolean b = studentDao.addStudent(stu1);
        String msg_addStu = "";
        System.out.println("是否添加成功： " + b);
        if (b){
            //添加成功
            msg_addStu = "1";
            response.getWriter().println(msg_addStu);
        }else {
            msg_addStu = "0";
            response.getWriter().println(msg_addStu);
        }
    }

}
