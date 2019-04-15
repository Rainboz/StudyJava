package com.zhb.Obj;

import java.text.DecimalFormat;

/*
* 计算圆的面积*/
public class Circle {
    private final static double P = 3.14111111;
    static double areasum;
    public static void main(String[] args) {
        area(3);
    }
    public static void area(double r){
        areasum = P*(Math.pow(r,2));
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(areasum));
        System.out.println(areasum);
    }
}
