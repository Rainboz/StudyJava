package com.zhb.javaSE.package201904.package04;

import java.util.Arrays;
import java.util.Scanner;

//输入3个整数，将其中最小的数输出。
public class T14 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        Scanner sc = new Scanner(System.in);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("输入3个整数：");
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        System.out.println(b[0]);
    }
}
