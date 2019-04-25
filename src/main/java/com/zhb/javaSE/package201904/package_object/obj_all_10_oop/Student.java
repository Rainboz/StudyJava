package com.zhb.javaSE.package201904.package_object.obj_all_10_oop;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 10:07
 **/
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student student = new Student("zhb",15);
        System.out.println(student.getAge());
        System.out.println(student.getName());

    }
}
