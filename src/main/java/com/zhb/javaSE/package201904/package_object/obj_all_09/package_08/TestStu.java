package com.zhb.javaSE.package201904.package_object.obj_all_09.package_08;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-24 10:39
 **/
public class TestStu {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            double s = Double.parseDouble(String.format("%.2f",(1+Math.random())*(i+45)+1));
            students[i] = new Student(i,"stu"+i,s);
        }
        Compute compute = new Compute();
        compute.sort(students);
        compute.disp(students);
    }
}
