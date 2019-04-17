package com.zhb.javaSE;

import java.util.Scanner;

public class Stu {
    public static void main(String[] args) {
        int min = -1;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int a = sc.nextInt();
        int c[] = new int[a];
        System.out.println(a+"个成绩");
        for (int i = 0; i < a; i++) {
            int b = sc2.nextInt();
            c[i] =  b;
            if (c[i] > min){
                max = c[i];
                min = max;
            }

        }
        //冒泡排序maopao
        int temp = 0;
        for (int i = 0; i < c.length-1; i++) {
            for (int j = 0; j < c.length-1-i ; j++) {
                if (c[j]<c[j+1]){
                    temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        System.out.println("最高分是"+max);//最大值
        //System.out.println(c[4]);
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= c[0]-10){
                System.out.println("student0 score is"+c[i]+"grade is A");
            }else if (c[i] >= c[0]-20){
                System.out.println("student0 score is"+c[i]+"grade is B");
            }else if (c[i] >= c[0]-30){
                System.out.println("student0 score is"+c[i]+"grade is C");
            }else {
                System.out.println("student0 score is"+c[i]+"grade is D");
            }
        }

    }

}
