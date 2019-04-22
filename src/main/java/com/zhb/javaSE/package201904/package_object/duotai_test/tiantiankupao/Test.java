package com.zhb.javaSE.package201904.package_object.duotai_test.tiantiankupao;

/**
 * @program: StudyJava
 * @description: test
 * @author: rainboz
 * @create: 19-4-22 下午4:22
 **/
public class Test {
    public void method1(Pet p) {
        if (p instanceof Cat) {
            Hero hero = new Hero("hero", p);
            hero.run();
        }
        if (p instanceof Dog) {
            Hero hero = new Hero("hero", p);
            hero.run();
        }
        if (p instanceof Eagle) {
            Hero hero = new Hero("hero", p);
            hero.run();
        }

    }

    public static void main(String[] args) {
        Pet p3 = new Cat();
        Pet p2 = new Dog();
        Pet p1 = new Eagle();
        Test t = new Test();

        t.method1(p1);
        System.out.println();
        t.method1(p2);
        System.out.println();
        t.method1(p3);
    }
}

