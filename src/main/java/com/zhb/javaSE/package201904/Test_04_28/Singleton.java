package com.zhb.javaSE.package201904.Test_04_28;

public class Singleton {
    //饿汉
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
