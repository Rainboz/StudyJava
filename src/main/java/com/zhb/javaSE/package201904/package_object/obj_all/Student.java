package com.zhb.javaSE.package201904.package_object.obj_all;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-23 19:23
 **/
public class Student extends Person{
    private double chinese;
    private double english;
    private double science;
    private double math;
    private double computer;

    public Student(String name, int age, String sex, double chinese, double english, double science, double math, double computer) {
        super(name, age, sex);
        this.chinese = chinese;
        this.english = english;
        this.science = science;
        this.math = math;
        this.computer = computer;
    }
    public double avg(){
        double sum = 0;
        sum += chinese+english+science+math+computer;
        return sum/5;
    }
}
