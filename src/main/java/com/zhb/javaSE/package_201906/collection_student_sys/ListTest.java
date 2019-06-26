package com.zhb.javaSE.package_201906.collection_student_sys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @program: StudyJava
 * @description: 备选课程类
 * @author: rainboz
 * @create: 2019-06-25 10:44
 **/
public class ListTest {
    /**
     * 用于存储备选课程的list
     */
    public List courseToSelect;

    public ListTest() {
        this.courseToSelect = new ArrayList();
    }

    public void testAdd() {
        Course c1 = new Course("1", "数据结构");
        courseToSelect.add(c1);
        Course temp = (Course) courseToSelect.get(0);
        System.out.println("添加了一个课程:" + temp.getId() + ":" + temp.getName());

        Course c2 = new Course("2", "C语言");
        courseToSelect.add(0, c2);
        Course temp2 = (Course) courseToSelect.get(0);
        System.out.println("添加了一个课程:" + temp2.getId() + ":" + temp2.getName());

        courseToSelect.add(c1);
        Course temp0 = (Course) courseToSelect.get(2);
        System.out.println("添加了一个课程:" + temp0.getId() + ":" + temp0.getName());

        Course[] courses = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        courseToSelect.addAll(Arrays.asList(courses));
        Course temp3 = (Course) courseToSelect.get(3);
        Course temp4 = (Course) courseToSelect.get(4);
        System.out.println("添加了两门课程:" + temp3.getId() + ":" + temp3.getName() + ";" + temp4.getId() + ":" + temp4.getName());

        Course[] courses1 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
        courseToSelect.addAll(2, Arrays.asList(courses1));
        Course temp5 = (Course) courseToSelect.get(2);
        Course temp6 = (Course) courseToSelect.get(3);
        System.out.println("添加了两门课程:" + temp5.getId() + ":" + temp5.getName() + ";" + temp6.getId() + ":" + temp6.getName());
    }
    /*
     *功能描述 @description: TODO 取得list中的元素方法
     * @date 2019/6/25 11:12
     * @param []
     * @return void
     */
    public  void testGet(){
        int size = courseToSelect.size();
        System.out.println("有如下课程待选：");
        for (int i = 0; i < size; i++) {
            Course cr = (Course) courseToSelect.get(i);
            System.out.println("课程"+i+"："+cr.getId()+":"+cr.getName());
        }
    }
    public void testIterator(){
        int i=0;
        Iterator it = courseToSelect.iterator();
        System.out.println("有如下课程待选(通过迭代器访问)：");
        while (it.hasNext()){
            Course cr = (Course)it.next();
            System.out.println("课程"+i+"："+cr.getId()+":"+cr.getName());
            i++;
        }
    }
    public void testForEach(){
        System.out.println("有如下课程待选(通过ForEach访问)：");
        int i=0;
        for (Object o:courseToSelect){
            Course cr = (Course) o;
            System.out.println("课程"+i+":"+cr.getId()+":"+cr.getName());
            i++;
        }
    }
    /*
     *功能描述 @description: TODO 修改list的元素
     * @date 2019/6/25 11:36
     * @param []
     * @return void
     */
    public void testModifiy(){
        courseToSelect.set(4,new Course("7","毛概"));
        testForEach();
    }
    /*
     *功能描述 @description: TODO 删除元素
     * @date 2019/6/25 11:43
     * @param []
     * @return void
     */
    public void testDelete(){
        /*Course cr = (Course) courseToSelect.get(4);
        System.out.println("我是课程:"+cr.getId()+":"+cr.getName()+",我即将被删除");
        boolean flag = courseToSelect.remove(cr);
        if (flag){
            System.out.println("成功删除课程！");
        }else {
            System.out.println("删除失败！");
        }*/
        /*System.out.println("我即将被删除4位置上的课程");
        courseToSelect.remove(4);
        testForEach();*/
        System.out.println("即将被删除4,5位置上的课程");
        Course[] courses = {(Course) courseToSelect.get(4), (Course) courseToSelect.get(5)};
        courseToSelect.removeAll(Arrays.asList(courses));
        testForEach();
    }
    /*
     *功能描述 @description: TODO 添加其他类型
     * @date 2019/6/25 12:01
     * @param []
     * @return void
     */
    public void testType(){
        System.out.println("添加String");
        courseToSelect.add("我不是课程，我是String");
    }
    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
        //lt.testType();Exception in thread "main" java.lang.NullPointerException
        lt.testForEach();
//        lt.testGet();
//        lt.testIterator();
//        lt.testForEach();
//
//        lt.testModifiy();
//        lt.testDelete();
    }
}
