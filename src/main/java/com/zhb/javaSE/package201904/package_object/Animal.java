package com.zhb.javaSE.package201904.package_object;

/**
 * @program: StudyJava
 * @description: Animal
 * @author: rainboz
 * @create: 2019-04-19 15:03
 **/
public class Animal {
    private int age;
    String name;
    String home;

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

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", home='" + home + '\'' +
                '}';
    }
}
