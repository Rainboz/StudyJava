package com.zhb.javaSE.toObj.duotai;

public class Dog extends Animal{
    protected void  eat(){
        System.out.println("Dog子类");
    }
    protected Dog run(){
        System.out.println("返回值类型String报错");
        return null;
    }
}
