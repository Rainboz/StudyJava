package com.zhb.javaSE.package201904.package_object.obj_all_09.package_05;

/**
 * @program: StudyJava
 * @description: 已有若干学生数据，包括学号、姓名、成绩，要求输出这些学生数据并计算平均分。
 * @author: rainboz
 * @create: 2019-04-23 22:57
 **/
public class Student {
    private String stu_id;
    private String stu_name;
    private double stu_sroce;
    private static double sum;
    private static double num;

    public Student() {
    }

    public Student(String stu_id, String stu_name, double stu_sroce) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_sroce = stu_sroce;
    }

    public String disp() {
        /**
         *功能描述 @description: TODO 用于输出数据成员的值
         * @date 19-4-23 下午11:23
         * @param
         * @return String
         */
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                ", stu_name='" + stu_name + '\'' +
                ", stu_sroce=" + stu_sroce +
                ", 平均分=" + avg() +
                '}';
    }

    public static double avg() {
        /**
         *功能描述 @description: TODO 用于计算平均分
         * @date 19-4-23 下午11:27
         * @param []
         * @return double
         */
        return Double.parseDouble(String.format("%.2f",sum/num));
    }

    public static void main(String[] args) {
        Student[] student;
        student = new Student[4];

        for (int i = 0; i < student.length; i++) {
            double s = Double.parseDouble(String.format("%.2f",(1+Math.random())*(i+45)+1));
            student[i] = new Student(i+"","stu"+i,s);
            sum += student[i].stu_sroce;
            num = student.length;
        }
        for (Student x :student) {
            //遍历Student输出
            System.out.println(x.disp());
        }
    }
}
