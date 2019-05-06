package com.zhb.javaSE.package201904.package_collections.myObjectArray.test03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @program: StudyJava
 * @description: 键盘录入学生信息
 * @author: rainboz
 * @create: 2019-04-29 18:50
 **/
public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        method(array);
        method(array);
        method(array);
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println("Student:" + s.getName() + "----" + s.getAge());
        }
    }

    public static void method(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        array.add(s);
    }
}
