package com.zhb.javaSE.package201904.package_object.obj_all_13_abstract.package_02;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 11:52
 **/
public class Test {
    public static void main(String[] args) {
        Animal animal = new Bird();
        animal.eat();
        Animal animal2 = new Tiger();
        animal2.eat();
        Animal animal3 = new Deer();
        animal3.eat();

        if (animal instanceof Bird){
            Bird bird = (Bird) animal;
            bird.fly();
        }
    }
}
