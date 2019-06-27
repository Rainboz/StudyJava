package com.zhb.LintCode.package_201906;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

import static java.lang.Math.log;
import static java.lang.StrictMath.pow;

/**
 * @program: StudyJava
 * @description: 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * @author: rainboz
 * @create: 2019-06-25 09:43
 **/
public class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个正整数：");
        int n = sc.nextInt();
        boolean result = isPowerOfThree(n);
        System.out.println("输出：" + result);
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        int max = (int) pow(3, (int) (log(0x7fffffff) / log(3)));
        return (max % n == 0);
    }
}
