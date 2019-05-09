package com.zhb.javaSE.package201904.package_object.duotai_test.duotai_test2;

import java.text.DecimalFormat;

/**
 * @program: StudyJava
 * @description:计算矩形的面积
 * @author: rainboz
 * @create: 19-4-22 下午6:28
 **/
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    protected MyRectangle(double width,double height,String coclor, Double weight) {
        super(coclor, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double findArea(){
        DecimalFormat d = new DecimalFormat("0.00");
        return Double.parseDouble(d.format(width*height));
    }
}

