package com.zhb.javaSE.package201904.package03;
/**
 * 定义一个大 写字母，把它转换为小写字母后显示出来。
 */
public class Atoa {
    private static char str = 'A';
    private static char str1 = 'a';

    /**
     *
     */
    protected static void method(){
        int b = str;
        System.out.println(Character.toUpperCase(str));
        System.out.println(Character.toUpperCase(str1));
        System.out.println(b);
    }
    /*
     * 大写转小写*/
    protected static String method1(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] += 32;
            }
        }
        return String.valueOf(chars);
    }
    /*
    * 小写转大写*/
    protected static String method2(String str){
        char[] chars1 = str.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] >= 'a' && chars1[i] <= 'z'){
                chars1[i] -= 32;
            }
        }
        return String.valueOf(chars1);
    }
    /*
     * 小写转大写*/
    protected static void method3(){
        char a = '1';
        System.out.println((int)a);
    }
    public static void main(String[] args) {
//        method();
        method3();
        System.out.println(method1("AAADFDFSA"));
        System.out.println(method2("bddJJJJ"));
        System.out.println(method1("2"));
        System.out.println(method2("a"));
        //method1("A");
        //method2("b");
    }
}
