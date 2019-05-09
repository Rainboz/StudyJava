package com.zhb.javaSE.package201904.package_object.obj_all_13_abstract.package_04;


/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 11:55
 **/
public class DC implements USB {
    @Override
    public void connect() {
        System.out.println("USB IS DC");
    }
    public void method1(){
        System.out.println("method1: DC独有的方法");
    }
}
