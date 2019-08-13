package com.zhb.LintCode.packaages_0813;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-13 下午9:49
 */
public class Test01<method> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m1 = method1(a,b,c);
        int m2 = method2(a,b,c);
        int m3 = method3(a,b,c);
        int m4 = method4(a,b,c);
        /*System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);*/
        int[] arry = new int[4];
        arry[0] = m1;
        arry[1] = m2;
        arry[2] = m3;
        arry[3] = m4;
        Arrays.sort(arry);
        System.out.println(arry[3]);
    }
    public static int method1(int a,int b,int c){
        return a+b*c;
    }
    public static int method2(int a,int b,int c){
        return a*(b+c);
    }
    public static int method3(int a,int b,int c){
        return a*b*c;
    }
    public static int method4(int a,int b,int c){
        return (a+b)*c;
    }
}
