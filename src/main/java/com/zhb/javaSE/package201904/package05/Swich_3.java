package com.zhb.javaSE.package201904.package05;

import java.util.Scanner;

//JavaSE-基本语法3.pptx

public class Swich_3 {
    public static void method0() {}
    /**
     *1.使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。
     */
    public static void method1(char a) {
        String str = "other";
        switch (a){
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                str = ""+(char)(a-32);
        }
        System.out.println(str);
    }

    /**
     *3.根据用于指定月份，打印该月份所属的季节。
     * 3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季
     * */
    public static void method2(int j) {
        switch (j){
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("winner");
                break;
            default:
                System.out.println("other");
        }
    }
    /**
     * 4. 编写程序：从键盘上输入2014年的“month”和“day”，要求通过程序输出输入的日期为2014年的第几天。
     *
     */
    public static void method3() {
        int[] runnian = {31,29,31,30,31,30,31,31,30,31,30,31};
        int[] zc = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份：");
        int year = sc.nextInt();
        System.out.println("输入月份：");
        int month = sc.nextInt();
        System.out.println("输入天数：");
        int day = sc.nextInt();
        int type = 0;
        int sumDays = 0;
        if (year % 100 != 0 && year % 4 ==0 || year % 400 == 0){
            type = 1;
        }else {
            type = 0;
        }
        switch (type){
            case 1:
                for (int i = 1; i < month ; i++) {
                    //0 3-0-1   1 3-1-1  2 0-2   i 0  index 2   i 1 index 1
                    //m      i       index
                    //3     12        01
                    //4     123       012
                    sumDays += runnian[month-i-1];
                }
                System.out.println("闰年"+year+"的第"+(sumDays+day)+"天");
                break;
            case 0:
                for (int i = 1; i < month; i++) {
                    sumDays += zc[month-i-1];

                }
                System.out.println("平年"+year+"的第"+(sumDays+day)+"天");
                break;
        }
     }
    public static void main(String[] args) {
        String s = "abcde";
//        method1('e');
//        method2(1);
//        method2(3);
//        method2(6);
//        method2(9);
        method3();
    }
}
