package com.zhb.javaSE.package201905.model;

/**
 * @program: StudyJava
 * @description: 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 在类内部创造单一对象，通过设置构造方法权限，使类外部无法再创造对象
 * @author: rainboz
 * @create: 2019-05-14 08:55
 **/
public class Singleton {
    //创建唯一对象
    private static Singleton instance = null;
    private int i;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
