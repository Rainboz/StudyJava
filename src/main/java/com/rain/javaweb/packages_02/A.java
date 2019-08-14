package com.rain.javaweb.packages_02;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-14 下午11:07
 */
public class A {
    public static void main(String[] args) {
        A obj = new D();
            System.out.println(obj instanceof B);
        System.out.println(obj instanceof C);
        System.out.println(obj instanceof D);
        System.out.println(obj instanceof A);


    }
}
class B extends A{}
class C extends A{}
class D extends B{}
