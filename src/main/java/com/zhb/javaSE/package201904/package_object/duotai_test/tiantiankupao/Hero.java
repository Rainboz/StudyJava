package com.zhb.javaSE.package201904.package_object.duotai_test.tiantiankupao;

/**
 * @program: StudyJava
 * @description: h
 * @author: rainboz
 * @create: 19-4-22 下午4:20
 **/
public class Hero {
    private String name;
    private Pet p;

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, Pet p) {
        this.name = name;
        this.p = p;
    }

    public void run(){
        System.out.println("Hero run");
        p.follow();

    }
}

