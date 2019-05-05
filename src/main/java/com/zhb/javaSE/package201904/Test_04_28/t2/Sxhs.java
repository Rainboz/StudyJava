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

            int b1 = c1 * c1 * c1;
            int b2 = c2 * c2 * c2;
            int b3 = c3 * c3 * c3;
            int c4 = b1 + b2 + b3;
            System.out.println("c1：" + c1);
            System.out.println("c2：" + c2);
            System.out.println("c3：" + c3);
            System.out.println("c4：" + c4);
            System.out.println("b1：" + b1);
            System.out.println("b2：" + b2);
            System.out.println("b3：" + b3);
            if (c4 == Integer.valueOf(str)) {
                System.out.println("水仙花数：" + str);
            }
        }
    }
}
