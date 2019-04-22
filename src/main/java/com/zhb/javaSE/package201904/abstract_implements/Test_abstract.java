package com.zhb.javaSE.package201904.abstract_implements;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-4-22 下午8:28
 **/
public class Test_abstract {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike m = new Motorbike();
        System.out.println(car.noOfWheels());
        System.out.println(m.noOfWheels());
        String str1 = "abc";
        String str2 = "abc";
        str1 = "abcabc";
        String str4 = "abc";
        String str5 = "a" + "bc";
        System.out.println(str1 == str5);//true

        String str6 = (str2 + str4).intern();
        System.out.println(str1 == str6);//false  ---->true
    }
}

