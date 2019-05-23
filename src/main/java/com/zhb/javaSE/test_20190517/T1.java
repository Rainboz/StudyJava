package com.zhb.javaSE.test_20190517;

import java.util.Scanner;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-17 下午12:00
 **/
public class T1 {
    static int sum1 = 0;
    static int sum2 = 0;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = kb.nextInt();
        f(n);
        method(n);
        System.out.println(sum1);
        System.out.println(sum2);
    }

    public static void f(int n) {
        if (n >= 1) {
            sum2 += n;
            n--;
            f(n);
        }
    }

    public static void method(int n) {
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }
    }
}

