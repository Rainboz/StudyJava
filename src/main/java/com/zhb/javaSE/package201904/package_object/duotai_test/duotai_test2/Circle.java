package com.zhb.javaSE.package201904.package_object.duotai_test.duotai_test2;

import java.text.DecimalFormat;

/**
 * @program: StudyJava
 * @description:计算圆的面积
 * @author: rainboz
 * @create: 19-4-22 下午6:25
 **/
public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius,String color,double weight) {
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        DecimalFormat d = new DecimalFormat("0.00");
        return Double.parseDouble((d.format(Math.PI*radius*radius)));
    }
}

