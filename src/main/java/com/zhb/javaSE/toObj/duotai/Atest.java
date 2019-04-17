package com.zhb.javaSE.toObj.duotai;

public class Atest {
    public static void main(String[] args) {
        Animal  a = new Cat();
        a.eat();
        ((Cat) a).NewMethod();
        Object a1;
        a = new Dog();
        a.eat();
        a = new Eagle();
        a.eat();
        if (a instanceof Cat){
        //a.NewMethod();
            Cat c = (Cat) a;
            c.NewMethod();
        }else if (a instanceof Dog){
            Dog dog = (Dog) a;
        }

        System.out.println();
    }
}
