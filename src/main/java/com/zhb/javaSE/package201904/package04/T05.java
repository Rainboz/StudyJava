package com.zhb.javaSE.package201904.package04;

import java.util.Scanner;

public class T05 {
    static int a;
    static int[] b;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            a = sc.nextInt();
            if (a>1000){
                System.out.println("输入的数值有大于1000的");
            }
        }
//        for (int i = 0; i < b.length; i++) {
//            b[i] = sc1.nextInt();
//            if (b[i]>1000){
//                System.out.println("sada a");
//            }
//        }
    }
}
