package com.zhb.javaSE.package201904.package04;

import java.math.BigDecimal;

public class Ass {
    public static void main(String[] args) {
        method1(1);
        m();
        t22();
    }
    //求圆的面积 保留兩位小數
    public static Double method1(double r){
        System.out.println(String.format("%.2f",Math.PI*r*r));
        BigDecimal b = new BigDecimal(Math.PI*r*r);
        double d = b.setScale(2,BigDecimal.ROUND_UP).doubleValue();
        System.out.println(d);
        return d;
    }
    //17.定义一个字符，并将这个字符输出
    public static char m(){
        char a = 'H';
        System.out.println(a);
        return a;
    }
    //22.设int a=9; 分别求出 a+=10 , a-=5, a*=8, a/=3的结果
    public static int t22(){
        int a = 9;
        System.out.println(a+=10);//19
        System.out.println(a-=5);//4 14
        System.out.println(a*=8);//72 112
          System.out.println(a/=3);//3 37
        return a;
    }

}
