package com.zhb.javaSE.toObj.duotai.T4;

public class MyRectangle extends GeometricObject {
    private double width;
    private double height;

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
    ////构造方法public
    public MyRectangle(Double width,Double height,String color, Double weight) {
//        super(color, weight);
        this.height = height;
        this.width = width;
    }

    @Override
    public Double findArea() {
        //计算矩形面积
        return width*height;
    }
}
