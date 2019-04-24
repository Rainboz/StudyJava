package com.zhb.javaSE.package201904.package_object.obj_all_oop_09;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 00:13
 **/
public class TestCal {
    public static void main(String[] args) {
        Calculater calculater = new Calculater();
        System.out.println("a+b="+calculater.add(1,2));
        System.out.println("a-b="+calculater.sub(1,2));
        System.out.println("a*b="+calculater.ride(1,2));
        System.out.println("a/b="+calculater.division(1,2));

    }
}
