package com.zhb.javaSE.package201904.package_object.obj_all_extends_11;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 10:18
 **/
public class Student extends Person {
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        super(name, age);
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex=" + sex +
                '}';
    }
}
