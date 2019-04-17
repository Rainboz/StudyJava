package com.zhb.javaSE.toObj.duotai.T4;

public class GeometricObject {
    protected final double PI = 3.1415926;
    protected String color;
    protected Double weight;

    public GeometricObject() {
    }

    protected GeometricObject(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double findArea(){
        return 0.0;
    }
    //注意方法的参数类型，利用动态绑定技术
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        //测试两个对象的面积是否相等
        if (g1.findArea() == g2.findArea()){
            return true;
        }
        return false;
    }
    public void displayGeometricObject(GeometricObject g){
        //显示对象的面积
        if(g instanceof Circle){
            System.out.println("圆面积为："+g.findArea());
        }else {
            System.out.println("矩形面积为："+g.findArea());
        }
    }
}
