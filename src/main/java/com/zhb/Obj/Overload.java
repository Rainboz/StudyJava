package com.zhb.Obj;

import java.util.Arrays;

/*
*数组工具类，求 最大值，最小值，排序
* 两个数组组合成一个新的数组，求平均值，数组内是否有9.
* */
public class Overload {
    static int a[] = {1,5,23,12,8};
    static int b[] = {3,6,9,5,4};
    static int max = 0;
    static int min = 0;
    static double avg = 0;
    public static int max(int a[]){
        for (int i = 0; i < a.length; i++) {
            if (a[i]>min){
                max = a[i];
                min = max;
            }
        }
        System.out.println("a的最大值："+max);
        return max;
    }
    public static int min(int a[]){
        for (int i = 0; i < a.length; i++) {
            if (a[i]<max){
                min = a[i];
                max = min;
            }
        }
        System.out.println("a的最小值："+min);
        return min;
    }
    public static int[] sort(int a[]){
        Arrays.sort(a);
        System.out.println("a的有序："+Arrays.toString(a));
        return a;
    }
    public static double addArrays(int a[],int b[]){
        int alength = a.length;
        int blength = b.length;
        int c[] = new int[alength+blength];
        int sum = 0;
        //Arrays.copyOf(a,10);
        //System.arraycopy(a,1,b,alength,blength);
        System.arraycopy(a,0,c,0,alength);
        System.arraycopy(b,0,c,alength,blength);
        System.out.println("a和b组成c："+Arrays.toString(c));
        for (int i = 0; i < c.length; i++) {
            sum = sum + c[i];
            avg = sum/c.length;
            if (c[i] == 9){
                System.out.println("数组中含有9！");
            }
        }
        System.out.println("a和b组成c的平均值："+avg);
        return avg;
    }
    //二分搜索法
    public static boolean isNinght(int[] a,int b){
        int key = Arrays.binarySearch(a,9);
        if (key >= 0){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }

    }
    public static void main(String[] args) {
        max(a);
        min(a);
        sort(a);
        addArrays(a,b);
        isNinght(a,9);
    }
}
