package com.zhb.javaSE.package201904.package_object.obj_all_13_abstract.package_04;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 11:56
 **/
public class Test {
    public static void main(String[] args) {
        USB usb1 = new DC();
        USB usb2 = new Mp3();
        usb1.connect();
        usb2.connect();
        System.out.println();
        method(usb1);
        method(usb2);
    }

    public static void method(USB usb) {
        if (usb instanceof DC) {
            DC dc = (DC) usb;
            dc.method1();
        }
        if (usb instanceof Mp3) {
            Mp3 mp3 = (Mp3) usb;
            mp3.method1();
        }
    }
}
