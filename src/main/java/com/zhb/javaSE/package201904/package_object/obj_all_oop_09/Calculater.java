package com.zhb.javaSE.package201904.package_object.obj_all_oop_09;

/**
 * @program: StudyJava
 * @description: 颜色，价格，品牌属性
 * @author: rainboz
 * @create: 2019-04-25 00:10
 **/
public class Calculater extends Cal{
    private String color;
    private String price;
    private String brand;
    //如果不能使用操作运算符，怎么做

    @Override
    public double add(double a, double b) {
        return (a+b);
    }

    @Override
    public double sub(double a, double b) {
        return (a-b);
    }

    @Override
    public double ride(double a, double b) {
        return (a*b);
    }

    @Override
    public double division(double a, double b) {
        return (a/b);
    }
}
