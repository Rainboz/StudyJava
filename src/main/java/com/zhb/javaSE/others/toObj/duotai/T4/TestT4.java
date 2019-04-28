package com.zhb.javaSE.toObj.duotai.T4;

public class TestT4 {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle(2.0,"bule",2.0);
        GeometricObject g2 = new MyRectangle(2.0,2.0,"red",3.0);
        System.out.println(g1.equalsArea(g1,g2));
        g1.displayGeometricObject(g1);
        g2.displayGeometricObject(g2);
    }
}
