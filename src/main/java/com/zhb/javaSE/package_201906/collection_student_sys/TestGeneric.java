package com.zhb.javaSE.package_201906.collection_student_sys;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-06-25 12:05
 **/
public class TestGeneric {
    /*
    带有泛型的list属性
     */
    public static List<Course> courses ;

    public TestGeneric() {
        this.courses = new ArrayList<Course>();
    }

    /**
     *测试添加
     */
    public static   void testAdd(){
        Course c1 = new Course("1","语文");
        courses.add(c1);
        //泛型集合不能添加规定以外的类型，否则编译不通过
        //courses.add("a");
        Course c2 = new Course("2","java");
        boolean fl = courses.add(c2);
        System.out.println(fl);
    }

    /**
     * 循环遍历
     */
    public static   void testForEach(){
        System.out.println("有如下课程待选(通过ForEach访问)：");
        int i=0;
        for (Course cr:courses){
            System.out.println("课程"+i+":"+cr.getId()+":"+cr.getName());
            i++;
        }
    }
    public static void main(String[] args){
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testForEach();
       /* testAdd();
        testForEach();*/
    }
}
