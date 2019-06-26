package com.zhb.LintCode.package_201906;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-06-25 09:18
 **/
public class Test {
    public static void main(String[] args) {
        char[] a = new char[4];
        byte[] b = new byte[4];


        for (int i = 0; i< 4; i++) {
            a[i] = 'a';
            b[i] = 'a';
        }
        String str =  new String(a);
        String st1r =  new String(b);
        System.out.println(a[0]);
        System.out.println(str+"------"+st1r);
    }
}
