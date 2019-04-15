package com.zhb.javaSE.T17;

public class Person {
    private String name;
    private int age;

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
    public void display(){
        System.out.println(name+"的年龄"+age);
    }
    public static void main(String[] args) {
        Person person = new Person("zkdwb",22);
        new Person("爱上大",12);
    }
}
