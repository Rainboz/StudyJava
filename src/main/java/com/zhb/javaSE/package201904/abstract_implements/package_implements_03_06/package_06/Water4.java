package com.zhb.javaSE.package201904.abstract_implements.package_implements_03_06.package_06;

/**
 * @program: StudyJava
 * @description: 加糖，加热
 * @author: rainboz
 * @create: 2019-04-23 18:13
 **/
public class Water4 extends Water implements sugar,hot{
    @Override
    public void water() {
        System.out.println("加糖，加热");
    }
}
