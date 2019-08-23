package com.rain.javaweb.login.dao;

import com.google.gson.Gson;
import com.rain.javaweb.login.beans.Student;
import com.rain.javaweb.login.util.DataUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-22 下午2:21
 */
public class StudentDaoImplTest {
    StudentDao studentDao = new StudentDaoImpl();

    @Test
    public void getStudentList() {

        List<Student> studentList = studentDao.getStudentList();
        for (Student x : studentList) {
            System.out.println(x.toString());
        }
        Gson gson = new Gson();
        String s = gson.toJson(studentList);
        System.out.println(s);
    }

    @Test
    public void selectByStuId() {
        Student student = studentDao.selectByStuId(15905139);
        System.out.println(student.toString());
    }

    @Test
    public void selectById() {
        Student student = studentDao.selectById(1);
        System.out.println(student.toString());
    }

    @Test
    public void addStudent() {
        /*Student stu1 = new Student();
        stu1.setStuId(15905139);
        stu1.setName("朱海波");
        stu1.setSex("男");
        stu1.setAge(23);
        stu1.setPhone("18758575376");
        boolean b = studentDao.addStudent(stu1);
        System.out.println("是否添加成功： " + b);*/
        Student student = new Student();
        //使用局部变量，保证每次获取的值是随机的
        for (int i = 0; i < 10; i++) {
            int stuId = (int) DataUtil.getNum(8);
            String name = DataUtil.getRandomJianHan(3);
            String sex = DataUtil.getSex();
            int age = (int) DataUtil.getNum(2);
            String phone = DataUtil.getTel();
            student.setStuId(stuId);
            student.setName(name);
            student.setSex(sex);
            student.setAge(age);
            student.setPhone(phone);
            studentDao.addStudent(student);
        }

        getStudentList();
    }

    @Test
    public void deteleStudent() {
        int i = studentDao.deteleStudent(15905138);
        if (i == 0){
            System.out.println("删除失败");
        }else {
            System.out.println("删除成功");
            getStudentList();
        }
    }

    @Test
    public void updateStudent() {
        Student stu1 = new Student();
        stu1.setStuId(15905138);
        stu1.setName("朱葛烤鱼");
        stu1.setSex("男");
        stu1.setAge(23);
        stu1.setPhone("18758570436");
        int i = studentDao.updateStudent(stu1);
        if (i == 0){
            System.out.println("更新失败");
        }else {
            System.out.println("更新成功");
            getStudentList();
        }
    }
}