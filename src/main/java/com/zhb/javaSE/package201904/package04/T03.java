package com.zhb.javaSE.package201904.package04;

import java.util.Scanner;

public class T03 {
    static int[] runnian = {31,29,31,30,31,30,31,31,30,31,30,31};
    static int[] zc = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = s1.nextInt();
        System.out.println("请输入月份：");
        int month =  s2.nextInt();
        if (month >= 1 && month <= 12 && year > 0){
            method1(year,month);
            System.out.println(method1(year,month));
        }else {
            System.out.println("请输入正确的年月");
        }

    }
    public static int method1(int year,int month){
        int day = 0;
        if (year % 100 != 0 && year % 4 ==0 || year % 400 == 0){
            //闰年
            day = runnian[month-1];
        } else {
            day = zc[month-1];
            return day;
        }
        return day;
    }
}
