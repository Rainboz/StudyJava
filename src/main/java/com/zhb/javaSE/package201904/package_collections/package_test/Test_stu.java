package com.zhb.javaSE.package201904.package_collections.package_test;

import java.util.*;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-28 11:58
 **/
public class Test_stu {
    public static void main(String[] args) {
        Student student1 = new Student("刘德华",85);
        Student student2 = new Student("张学友",100);
        Student student3 = new Student("刘杰",65);
        Student student4 = new Student("章子怡",58);
        Student student5 = new Student("周迅",76);
        List list = new LinkedList();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        Object[] obj = list.toArray();
        System.out.println("对象个数："+obj.length);
        //遍历
        for (Object x :obj) {
            System.out.println("数组："+x);
        }
        list.remove(2);//删除姓名为“刘杰”的学生信息，并输出LinkedList中现有学生信息。
       for (Iterator<Student> it = list.iterator();it.hasNext();){
           System.out.println(it.next());
       }
       //3、将姓名为“刘德华”的学生成绩改为95。
        System.out.println("--------------------------------");
        list.set(0,new Student("刘德华",95));
       Iterator<Student> it = list.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }
        System.out.println("---------------------------------");
       //输出成绩不及格的学生姓名
        ListIterator<Student> iterator = list.listIterator();
        list.set(0,new Student("刘德华",12));
//        iterator.set(student1);
        while (iterator.hasNext()){
            if (iterator.next().getScore()<60){
                System.out.println(list.get(iterator.previousIndex()));
            }
        }
    }
}
