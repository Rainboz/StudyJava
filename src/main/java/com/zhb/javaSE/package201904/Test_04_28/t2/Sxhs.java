package com.zhb.javaSE.package201904.Test_04_28.t2;

import java.util.ArrayList;

/**
 * @program: StudyJava
 * @description:求水仙花数 153=1^3+5^3+3^3
 * @author: rainboz
 * @create: 2019-05-06 00:33
 **/
public class Sxhs {
    public static void main(String[] args) {
        method();
        System.out.println(-10%3);
        System.out.println(-10%-3);
    }

    //3位数，打印所有水仙花数
    private static void method() {
        String str;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            arrayList.add(String.valueOf(i));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            str = arrayList.get(i);
//            char[] ch = str.toCharArray();
            char c1 = str.charAt(0);
            char c2 = str.charAt(1);
            char c3 = str.charAt(2);
            //char-->string-->int
//            int i1 = Integer.valueOf(Character.toString(c1));
//            int i2 = Integer.valueOf(Character.toString(c2));
//            int i3 = Integer.valueOf(Character.toString(c3));
            //char转int
            int i1 = Character.getNumericValue(c1);
            int i2 = Character.getNumericValue(c2);
            int i3 = Character.getNumericValue(c3);
            //截取字符串三位数
            String s1 = str.substring(0, 1);
            String s2 = str.substring(1, 2);
            String s3 = str.substring(2, 3);
            //截取字符-->转int
//            int i1 = Integer.valueOf(s1);
//            int i2 = Integer.valueOf(s2);
//            int i3 = Integer.valueOf(s3);
            //截取数的3次方
            int b1 = i1 * i1 * i1;
            int b2 = i2 * i2 * i2;
            int b3 = i3 * i3 * i3;
            //相加与原值相比较
            int c4 = b1 + b2 + b3;
            if (c4 == Integer.valueOf(str)) {
                System.out.println("水仙花数：" + str);
            }
        }
    }
}
