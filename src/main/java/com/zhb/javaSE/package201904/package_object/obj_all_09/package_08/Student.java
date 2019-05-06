package com.zhb.javaSE.package201904.package_object.obj_all_09.package_08;

/**
 * @program: StudyJava
 * @description: 编写一个程序，统计学生成绩，其功能包括输入学生的姓名和成绩，按成绩从高到低排列打印输出，对前%70的学生定为合格(PASS)，而后30%的学生定为不合格(FAIL)
 * @author: rainboz
 * @create: 2019-04-24 10:07
 **/
public class Student {
    private int stu_id;
    private String stu_name;
    private double stu_sroce;

    public Student() {
    }

    public Student(int stu_id, String stu_name, double stu_sroce) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_sroce = stu_sroce;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public double getStu_sroce() {
        return stu_sroce;
    }

    public void setStu_sroce(double stu_sroce) {
        this.stu_sroce = stu_sroce;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_sroce=" + stu_sroce +
                '}';
    }
}
