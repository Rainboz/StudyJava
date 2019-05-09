package com.zhb.javaSE.package201904.package_object.test1_Collections;

/**
 * @program: StudyJava
 * @description:定义一个User类：该类包含：private成员变量（int类型）id，age；（String类型）name。
 * @author: rainboz
 * @create: 2019-04-23 14:14
 **/
public class User {
    private int id;
    private int age;
    String name;

    public User() {
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
