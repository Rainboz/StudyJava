package com.zhb.javaSE.package201904.package_object.obj_all_09.package_07;

/**
 * @program: StudyJava
 * @description: 输入N个学生数据，包括学号、姓名、成绩，要求只输出成绩在80~89分的学生数据。
 * @author: rainboz
 * @create: 2019-04-23 23:52
 **/
public class Student {
    private String stu_id;
    private String stu_name;
    private double stu_sroce;

    public Student() {
    }

    public Student(String stu_id, String stu_name, double stu_sroce) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_sroce = stu_sroce;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
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
        if (stu_sroce >= 80 && stu_sroce <= 89)
            return "Student{" +
                    "stu_id='" + stu_id + '\'' +
                    ", stu_name='" + stu_name + '\'' +
                    ", stu_sroce=" + stu_sroce +
                    '}';
        else
            return "成绩："+ stu_sroce+ "不在80-89分内";

    }

    public static void main(String[] args) {
        Student[] students = new Student[4];
        for (int i = 0; i < students.length; i++) {
            double s = Double.parseDouble(String.format("%.2f",(1+Math.random())*(i+45)+1));
            students[i] = new Student(i+"","stu"+i,s);
        }
        for (Student x :students) {
            //遍历Student输出
            System.out.println(x);
        }
    }
}
