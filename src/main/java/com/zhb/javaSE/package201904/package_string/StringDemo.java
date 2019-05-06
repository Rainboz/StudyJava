package com.zhb.javaSE.package201904.package_string;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘录入一个字符串
        System.out.println("输入一个字符串");
        String str = sc.nextLine();
        //定义三个统计变量
        int big_count = 0;
        int small_count = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                big_count++;
                System.out.println("大写：" + c);
            } else if (c >= 'a' && c <= 'z') {
                small_count++;
                System.out.println("小写：" + c);
            } else {
                num++;
                System.out.println("数字：" + c);
            }
        }
        System.out.println("大写出现次数：" + big_count);
        System.out.println("小写出现次数：" + small_count);
        System.out.println("数字出现次数：" + num);

    }
}
