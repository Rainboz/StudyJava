package com.zhb.javaSE.toObj.duotai;

public class Cat extends Animal{
    @Override
    protected void  eat(){
        System.out.println("Cat子类");
    }
    protected void NewMethod(){
        System.out.println("调用子类新增方法");
    }
}
