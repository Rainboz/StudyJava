package com.zhb.javaSE.package201905.rkmoni_test;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-23 21:36
 **/
public class DrawCircleMain {
    public static void main(String[] args) {
        Shape reCircle =  new Circle(100,100,10,new RedCircle());
        Shape greenCircle =  new Circle(200,200,10,new GreenCircle());
        reCircle.draw();
        greenCircle.draw();
    }
}
