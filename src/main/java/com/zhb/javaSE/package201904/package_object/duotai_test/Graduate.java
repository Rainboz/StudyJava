package com.zhb.javaSE.package201904.package_object.duotai_test;

/**
 * @program: StudyJava
 * @description: 子孙类
 * @author: rainboz
 * @create: 19-4-22 下午3:19
 **/
public class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }
    public void run1(){
        System.out.println("Graduate 独有的方法");
    }
}

