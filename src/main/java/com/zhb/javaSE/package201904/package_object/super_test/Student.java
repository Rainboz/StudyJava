package com.zhb.javaSE.package201904.package_object.super_test;

/**
 * @program: 1
 * @description: stu
 * @author: rainboz
 * @create: 19-4-22 下午2:39
 **/
public class Student extends Person {
    protected String name = "李四";
    private String school = "New Oriental";

    public Student() {
        super();
    }

    public String getSchool() {
        return school;
    }

    public String getInfo() {
        return super.getInfo() + "\nschool: " + school + "\n父类name: " + super.name+"\n子类name: "+name;
    }
}

