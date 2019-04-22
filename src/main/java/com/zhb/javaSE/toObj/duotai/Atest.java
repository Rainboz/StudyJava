package com.zhb.javaSE.toObj.duotai;

public class Atest {
    public static void main(String[] args) {
//        Animal  a = new Cat();
//        a.eat();
//        ((Cat) a).NewMethod();
//        Object a1;
//        a = new Dog();
//        a.eat();
//        a = new Eagle();
//        a.eat();
//        if (a instanceof Cat){
//        //a.NewMethod();
//            Cat c = (Cat) a;
//            c.NewMethod();
//        }else if (a instanceof Dog){
//            Dog dog = (Dog) a;
//        }
//
//        System.out.println();
//        Animal animal2 = new Cat();
//        animal2.eat();
//        animal2.run2();
//        animal2.run3();
//        animal2.run();
//        //animal2.eat("444");父类不不能用子类独有的方法
//        Cat cat = new Cat();
//        cat.run2(2);
//        cat.run();
//        cat.eat();
        Animal animal = new Dog();

        animal.method1(1,2);//*
        animal.method2(1,2);///

    }
}
