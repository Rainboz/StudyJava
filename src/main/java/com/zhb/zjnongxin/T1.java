package com.zhb.zjnongxin;

import java.util.Scanner;

/**
 * @program: StudyJava
 * @description: 阶乘和
 * @author: rainboz
 * @create: 2019-04-27 19:45
 **/
public class T1 {
    private static int n=10;
    public static void main(String[] args) {
        System.out.println("10!=" + method1(10));
        System.out.println("1!+2!+3!+...+10!=" + sum(10));
        method2();
    }

    /**
     * 功能描述 @description: TODO 递归
     *
     * @param [n]
     * @return int
     * @date 19-4-27 下午7:50
     */
    //算阶乘
    public static int method1(int n) {
        if (n > 1)
            return method1(n - 1) * n;
        return 1;
    }

    //算阶乘的和
    public static int sum(int i) {
        if (i > 1) {
            return method1(i) + sum(i - 1);

        }
        return 1;
    }

    /**
     * 功能描述 @description: TODO 2个for循环，int result = 1;要放在for里面；
     *
     * @param []
     * @return void
     * @date 19-4-27 下午8:08
     */
    public static void method2() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int result = 1;
            for (int j = 1; j <= i; j++) {
                result = result * j;
            }
            sum += result;
        }
        System.out.println("1!+2!+3!+...+10!=" + sum);
    }

}
