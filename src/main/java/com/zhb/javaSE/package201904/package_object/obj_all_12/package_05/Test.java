package com.zhb.javaSE.package201904.package_object.obj_all_12.package_05;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 11:29
 **/
public class Test {
    static String name = "zhb";
    public static void main(String[] args) {
        //实验12-06题 :创建多个对象，修改其中一个对象的name值时，其他对象的name相应改变，static修饰的变量被所有对象共性
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t1.name = "t1";
//        t2.name = "t2";
//        t3.name = "t3";
        System.out.println(t1.name);
        System.out.println(t2.name);
        System.out.println(t3.name);
        //upCast 向上自动转型
        Animal animal1 = new Bird();
        Animal animal2 = new Cat();
        Animal animal3 = new Dog();
        animal1.sing();
        animal2.sing();
        animal3.sing();

        method(animal1);
        System.out.println();
        method(animal2);
        System.out.println();
        method(animal3);
        System.out.println();

    }
    public static void method(Animal animal){
        if (animal instanceof Bird){
            //downCast 向下转型要强转
            Bird bird = (Bird) animal;
            bird.tobird();
        }
        if (animal instanceof Cat){
            //downCast 向下转型要强转
            Cat cat = (Cat) animal;
            cat.tocat();
        }
        if (animal instanceof Dog){
            //downCast 向下转型要强转
            Dog dog = (Dog)animal;
            dog.todog();
        }
    }
}
