package com.zhb.javaSE.package201904.package_object;

public class Person {
    private String name;
    private int age;
    private String sex;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        display();
    }
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        display();
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void display() {
        System.out.println(name + "的年龄" + age+" 性别："+sex);
    }
    public void study(){
        System.out.println("Studying");
    }
    public void showAge(){
        System.out.println("age:"+age);
    }
    public int addAge(){
        this.age = age+2;
        return age;
    }
}
