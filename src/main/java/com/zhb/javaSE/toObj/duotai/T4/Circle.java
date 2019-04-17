package com.zhb.javaSE.toObj.duotai.T4;

public class Circle extends GeometricObject{
    private double radius;
    //构造方法public
    public Circle(Double radius,String color, Double weight) {
//        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public Double findArea() {
        //计算圆的面积
        return PI*radius*radius;
    }
}
