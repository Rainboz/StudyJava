package com.zhb.javaSE;

public class Demo {
    public static void main(String[] args) {
        int[] a=new int[1];
        mod(a);
        System.out.println(a[0]);
    }
    public static void mod(int[] a){
        a[0]++;
    }
}
