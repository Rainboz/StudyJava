package com.zhb.javaSE.package201904.package_object.duotai_test;

/**
 * @program: StudyJava
 * @description: stu
 * @author: rainboz
 * @create: 19-4-22 下午3:19
 **/
public class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school;
    }
    public void run(){
        System.out.println("Student类独有的方法");
    }
}

