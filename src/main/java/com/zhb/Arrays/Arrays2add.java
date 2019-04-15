package com.zhb.Arrays;

import java.util.Scanner;

/*a[3] = 9; a =12345
            a2=123945
*输入格式：b数组长度
*          a循环输入数组 ：1,2,3,4,5,
*          index输入插入位置：0
*          value输入插入的值：100
*/
public class Arrays2add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("输入数组长度");
        int b = sc.nextInt();
        int a[] = new int[b];
        int a2[] = new int[b+1];
        for (int i = 0; i < b; i++) {
            System.out.println("输入"+b+"个整数");
            int c = sc1.nextInt();
            a[i] = c;
        }
        System.out.println("输入插入位置index：");
        int index = sc2.nextInt();
        if (index < 0 || index >a.length){
            System.out.println("非法插入");
        }else {
            System.out.println("输入插入值value：");
            int value = sc3.nextInt();
            //主要
            for (int i = 0; i < a2.length-1; i++) {
//a[n]插入值100，从后面开始移
                //a[index] = value;
                // a[index+i] = a[index];
                if (i<index){
                    a2[i] = a[i];
                }else if (i == index){
                    a2[i] = value;
                }else {
                    a2[i] = a[i-1];
                }
            }
            for (int i = 0; i < a2.length-1 ; i++) {
                System.out.println(a2[i]);
            }
            // System.out.println(Arrays.toString(a2));
        }

    }
}
