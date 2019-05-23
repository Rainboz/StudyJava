package com.zhb.javaSE.package201905.rkmoni_test;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-23 21:33
 **/
public abstract class Shape {
    protected DrawCircle drawCircle;

    public Shape(DrawCircle drawCircle) {
        this.drawCircle = drawCircle;
    }

    public abstract void draw();
}
