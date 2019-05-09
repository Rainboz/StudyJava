package com.zhb.javaSE.package201904.package_object.super_test;

/**
 * @program: StudyJava
 * @description: aj
 * @author: rainboz
 * @create: 19-4-22 下午3:01
 **/
public class Sstudent extends Student {
    protected String name = "王五";
    protected int age = 20;
    public String getInfo() {
        return super.getInfo()+ "\nage: " + age +"\n祖父类age: "+super.age+ "\n父类name: " + super.name+"\n子类name: "+name;
    }
}

