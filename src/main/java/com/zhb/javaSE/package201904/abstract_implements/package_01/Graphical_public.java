package com.zhb.javaSE.package201904.abstract_implements.package_01;

/**
 * @program: StudyJava
 * @description: 图形共性
 * @author: rainboz
 * @create: 2019-04-23 15:58
 **/
/**
 * 3.边(共性)
 */
public class Graphical_public {
    private double length;
    private double bold;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBold() {
        return bold;
    }

    public void setBold(double bold) {
        this.bold = bold;
    }
}
