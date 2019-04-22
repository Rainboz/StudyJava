package com.zhb.javaSE.package201904.package_object;

/**
 * @program: StudyJava
 * @description: te
 * @author: rainboz
 * @create: 2019-04-19 15:10
 **/
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(22);
        animal.setName("tiger");
        animal.setHome("zoo");

        Person person = new Person();
        person.setName("zhb");
        person.setAge(23);
        person.showAge();
        person.study();
        person.addAge();
        person.showAge();
        System.out.println(animal.toString());
        System.out.println(person.toString());


    }
}
