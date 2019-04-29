package com.zhb.javaSE.package201904.package_collections.myObjectArray.test03;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-29 18:49
 **/
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
