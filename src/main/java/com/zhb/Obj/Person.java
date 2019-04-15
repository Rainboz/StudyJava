package com.zhb.Obj;

public class Person {
    private String name;
    private int age;
    private String sex;
    public void study(){
        System.out.println("studying");
    }
    public void  showAge(){
        this.age = age;
    }
    public int  addAge(){
        return age+2;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = p1;
//        p1.study();
//        System.out.println(p1.sex);
        System.out.println(p2.hashCode()+"===="+p1.hashCode());
    }
}
