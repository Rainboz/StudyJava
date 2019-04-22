package com.zhb.javaSE.toObj.duotai;

public class Animal {
   private int a = 6;
    public Animal() {
    }

    public Animal(int a) {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    protected void eat(){
        System.out.println("Animal父类");
    }
    protected Animal run(){
        System.out.println("f返回值类型int");
        return null;
    }
    protected final int run2(){
        System.out.println("返回值类型int,final修饰");
        return 0;
    }
    protected static int run3(){
        System.out.println("父类返回值类型int,static修饰");
        return 0;
    }
}
