package com.zhb.javaSE.package201904.package_object.duotai_test;

import java.util.Scanner;

/**
 * @program: StudyJava
 * @description: test
 * @author: rainboz
 * @create: 19-4-22 下午3:20
 **/
public class Test {
    public void method1(Person p){

        if (p instanceof Person){
            Student s = (Student) p;
            s.run();
            System.out.println("a person");
        }
        if (p instanceof Student){
            Graduate s = (Graduate) p;
            s.run1();
            ((Graduate) p).run1();
            System.out.println("a student");
        }
        if (p instanceof Graduate){
            System.out.println("a graduate");
        }

    }
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Student();
        Person p3 = new Graduate();
        Test t = new Test();
        //t.method1(p1);
        System.out.println();
        //t.method1(p2);
        System.out.println();
        t.method1(p3);
        t.method2();

    }
    public void method2(){
        String s = "4";
        Scanner sc = new Scanner(System.in);
        System.out.println("输入4：");
        String c = sc.next();
        System.out.println(c.getClass().getName()+"@"+Integer.toHexString(hashCode()));
        System.out.println(s.getClass().getName()+"@"+Integer.toHexString(hashCode()));
        System.out.println(c == "s");
    }
}

