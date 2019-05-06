package com.zhb.javaSE.package201904.package_object.obj_all_13_abstract.package_05;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 12:00
 **/
public abstract class Person {
    private String name;
    private int age;
    private char sex;

    public Person() {
    }

    public Person(String name, int age, char sex) {
        if (sex == ' ') {
            this.sex = '男';
        } else {
            this.sex = sex;
        }
        this.name = name;
        this.age = age;

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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    abstract void method1();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
