package com.zhb.javaSE.package201905.rkmoni_test;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-23 21:32
 **/
public class GreenCircle implements DrawCircle {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("DrawCircle Circle[green,radius:" + radius + ",x:" + x + ",y:" + y + "]");
    }
}
