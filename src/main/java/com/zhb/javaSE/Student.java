package com.zhb.javaSE;

import java.util.Random;

/*
* 创建20个学生对象，学号1-20，年级和成绩随机数，打印年级state=3的学生信息
* */
public class Student {
    private int number;
    private int state;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
    public static void main(String[] args) {
        Student a[] = new Student[20];
        int[] nj = new int[] {1,2,3};
        int[] cj = new int[] {1,2,3,4,5,6,7,8,9,0};
        Random r1 = new Random();
        for (int i = 0; i < a.length; i++) {
            // 給对于的堆空间赋值, 赋值为实例化StudentPerson之后, 新开辟的空间
            a[i] = new Student();
            a[i].number = i+1;
//            a[i].score = cj[r1.nextInt(nj.length-1)]+cj[r1.nextInt(nj.length)*2];
//            a[i].state = nj[r1.nextInt(nj.length)];
            a[i].state = (int) (Math.random() * 6 + 1);
            a[i].score = (int) Math.round((Math.random() * 100));
            if (a[i].state == 3){
                System.out.println(a[i].toString());
            }else {
//                System.out.println("----------------------------------------");
//                System.out.println(a[i].toString());
            }
        }
    }
}
