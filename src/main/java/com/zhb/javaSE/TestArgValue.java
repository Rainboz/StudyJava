package com.zhb.javaSE;

public class TestArgValue {
    public static void main(String[] args) {
        int i = 10;
        TestArgValue tv = new TestArgValue();
        tv.method1(i);
        System.out.println("i=" + i);//10

        System.out.println();//
        Demo1 d = new Demo1();
        System.out.println(d);//hash
        tv.method2(d);//
        System.out.println("d.i = " + d.i);//

    }
    public void method1(int i){
        System.out.println("method1i=" + i++);
    }

    public void method2(Demo1 d){
        System.out.println(d);//hash
        System.out.println("d.i : " + d.i*2);//5
    }
}
class Demo1{
    int i = 5;
}
