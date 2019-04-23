package com.zhb.javaSE.package201904.abstract_implements.package_implements_03_06.package_06;

/**
 * @program: StudyJava
 * @description: 过滤
 * @author: rainboz
 * @create: 2019-04-23 18:12
 **/
public class Water3 extends Water implements filter{
    @Override
    public void water() {
        System.out.println("过滤");
    }
}
