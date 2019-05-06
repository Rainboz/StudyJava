package com.zhb.javaSE.package201904.abstract_implements.package_implements_03_06;

import com.zhb.javaSE.package201904.package_object.extends_test.B;

/**
 * @program: StudyJava
 * @description: test
 * @author: rainboz
 * @create: 2019-04-23 16:39
 **/
public class InterfaceDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start("0");
        bike.start("1");
        bike.stop("1");
        bike.stop("0");

        Bus bus = new Bus();
        bus.start("0");
        bus.start("1");
        bus.stop("1");
        bus.stop("0");
    }
}
