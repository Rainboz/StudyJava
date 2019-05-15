package com.zhb.javaSE.package201905.thread;

public class Singleton {
    private static Singleton ourInstance = new Singleton();
    private int i;
    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
    public static void main(String[] args) {
       /* Singleton s = Singleton.getInstance();
        s.i = 45;
        Singleton s2 = Singleton.getInstance();
        s2.i = 54;
        System.out.println(s.i);
        System.out.println(s2.i);*/
//        Singleton s3 = new Singleton();同一类下可以直接new private 的构造方法，所以单例
    }
}
