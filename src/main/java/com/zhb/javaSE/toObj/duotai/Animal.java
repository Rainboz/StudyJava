package com.zhb.javaSE.toObj.duotai;

public class Animal {

    public Animal() {
    }

    protected void eat(){
        System.out.println("Animal父类");
    }
    protected int run(){
        System.out.println("f返回值类型int");
        return 0;
    }
    protected final int run2(){
        System.out.println("返回值类型int,final修饰");
        return 0;
    }
    protected static int run3(){
        System.out.println("父类返回值类型int,static修饰");
        return 0;
    }
    protected void method1(double a,double b){
        System.out.println(a+" + "+b+" = " +(a+b));
    }
    protected void method2(double a,double b){
        System.out.println(a+" - "+b+" = "+(a-b));
    }
}
