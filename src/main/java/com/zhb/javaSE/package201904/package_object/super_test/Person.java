package com.zhb.javaSE.package201904.package_object.super_test;

/**
 * @program: 1
 * @description: super
 * @author: rainboz
 * @create: 19-4-22 下午2:38
 **/
public class Person {
    protected String name = "张三";
    protected int age = 1;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getInfo() {
        return "Name: " + name + "\nage: " + age;
    }
}

