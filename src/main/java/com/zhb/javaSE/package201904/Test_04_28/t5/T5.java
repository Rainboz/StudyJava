package com.zhb.javaSE.package201904.Test_04_28.t5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-05 20:24
 **/
public class T5 {
    public static void main(String[] args) {
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("请输入数组元素：");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int[] re = swap(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(re));
        /*for (int i = 0; i < n; i++) {
            int temp = 0;
            if (array[i] < min){
                temp = array[n-1];
                array[n-1] = array[i];
                array[i] = temp;
            }
        }*/
    }
    public static int[] swap(int[] a){
        //最大跟第一元素换，最小跟最后元素换
        int temp = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            /*if (array[i] > max){
                max = array[i];
                temp = array[0];
                array[0] = array[i];
                array[i] = temp;
            }*/
            for (int j = 1; j < a.length; j++) {
                if (a[i] < a[j]){
                    temp = a[0];
                    a[0] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
