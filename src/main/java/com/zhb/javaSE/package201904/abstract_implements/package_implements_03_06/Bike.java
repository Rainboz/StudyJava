package com.zhb.javaSE.package201904.abstract_implements.package_implements_03_06;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-23 16:37
 **/
public class Bike implements Vehila{
    @Override
    public void start(String a) {
        if (a.equals("1")){
            System.out.println("Bike start");
        }else {
            System.out.println("请输入 1 启动");
        }
    }

    @Override
    public void stop(String a) {
        if (a.equals("0")){
            System.out.println("Bike stop");
        }else {
            System.out.println("请输入 0 停止");
        }
    }
}
