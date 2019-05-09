package com.zhb.javaSE.package201904.package_string;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        int aa[] = {1, 2, 3};
        String s = method(aa);
        System.out.println(s);

        String s2 = getString();
        System.out.println(s2);
    }

    /**
     * 字符串反转
     * @return
     */
    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String s1 = sc.nextLine();
        String s2 = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            //字符串转化char数组
            char[] chars = s1.toCharArray();
            s2 += chars[i];
        }
        return s2;
    }

    /**
     * 数组按指定格式拼接成字符串
     *
     * @param a
     * @return
     */
    public static String method(int[] a) {
        String str = "[";
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                str += a[i];
            } else {
                str += a[i] + ",";
            }
        }
        str += "]";
        return str;
    }
}
