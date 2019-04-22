package com.zhb.javaSE.package201904.package_object.duotai_test;

/**
 * @program: StudyJava
 * @description: 祖父类
 * @author: rainboz
 * @create: 19-4-22 下午3:18
 **/
public class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}

