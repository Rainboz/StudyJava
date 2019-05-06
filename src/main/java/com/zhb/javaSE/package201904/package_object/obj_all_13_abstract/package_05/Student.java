package com.zhb.javaSE.package201904.package_object.obj_all_13_abstract.package_05;

import java.util.List;
import java.util.Map;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 12:01
 **/
public class Student extends Person {
    private String stu_id;
    private String stu_school;
    private String stu_sroce;

    public Student() {
    }

    public Student(String name, int age, char sex, String stu_id, String stu_school, String stu_sroce) {
        super(name, age, sex);
        this.stu_id = stu_id;
        this.stu_school = stu_school;
        this.stu_sroce = stu_sroce;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_school() {
        return stu_school;
    }

    public void setStu_school(String stu_school) {
        this.stu_school = stu_school;
    }

    public String getStu_sroce() {
        return stu_sroce;
    }

    public void setStu_sroce(String stu_sroce) {
        this.stu_sroce = stu_sroce;
    }

    @Override
    void method1() {
        System.out.println("方法一");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex=" + super.getSex() +
                " Student[" +
                "stu_id='" + stu_id + '\'' +
                ", stu_school='" + stu_school + '\'' +
                ", stu_sroce='" + stu_sroce + '\'' + "]" +
                '}';
    }
}
