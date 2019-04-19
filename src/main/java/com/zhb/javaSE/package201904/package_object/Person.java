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
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void display() {
        System.out.println(name + "的年龄" + age);
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
