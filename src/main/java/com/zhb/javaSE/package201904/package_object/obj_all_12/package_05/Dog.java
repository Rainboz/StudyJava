package com.zhb.javaSE.package201904.package_object.obj_all_12.package_05;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 11:25
 **/
public class Dog extends Animal {
    public void sing(){
        System.out.println("Dog sing");
    }
    public void todog(){
        System.out.println("Dog 子类自己独有的方法 + 多态形式调用");
    }
}
