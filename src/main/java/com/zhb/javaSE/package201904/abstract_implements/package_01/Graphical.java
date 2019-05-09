package com.zhb.javaSE.package201904.abstract_implements.package_01;

/**
 * @program: StudyJava
 * @description: 图形设计一个能细分为矩形、三角形、圆形和椭圆形的“图形”类。使用继承将这些图形分类，找出能作为基类部分的共同特征(如校准点)和方法(如画法、初始化)，并看看这些图形是否能进一步划分为子类。
 * 本题只考虑实现思想，不考虑具体实现的细节，实现方式可自由发挥。
 * @author: rainboz
 * @create: 2019-04-23 15:53
 **/


/**
 * 1.有规则图形(区别)
 * 2.无规则图形
 * 抽象图形类 <--1,2(继承)
 */
public abstract class Graphical {
    private Graphical_public[] borders;
    /**
     * @description: 计算面积
     * @return
     */
   abstract double countSpace();

    public Graphical_public[] getBorders() {
        return borders;
    }

    public void setBorders(Graphical_public[] borders) {
        this.borders = borders;
    }
}
