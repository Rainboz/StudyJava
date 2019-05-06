package com.zhb.javaSE.package201904.package_string.StringBuilderDemo;

import java.io.File;

public class StringBuilder_test01 {
    public static void main(String[] args) {
        //调用方法
        boolean b = isLevelString("aba");
        System.out.println(b);
        System.out.println("----------------");
        boolean b2 = isLevelString("aakhsk");
        System.out.println(b2);
    }

    //判断一个字符串是否为对称字符串
    public static boolean isLevelString(String str) {
        //String-->StringBuilder--->reverse()--->String
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String result = sb.toString();
        return result.equals(str);
    }

}
