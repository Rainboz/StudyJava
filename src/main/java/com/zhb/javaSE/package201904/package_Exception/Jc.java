package com.zhb.javaSE.package201904.package_Exception;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-29 16:02
 **/
public class Jc {
    /*
     *n! = n*(n-1)!
     *
     */

    //递归求阶乘
    public static int f(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }

    }
    //斐波那契列数

    /**
     *
     * 1
     * 1
     * 2
     * 3
     * 5
     * 8
     * 13
     * 21
     * 34
     *
     */
    public static int method(int n){
        //出口
        if (n == 1 || n == 2){
            return 1;
        }else {
            return method(n-1)+method(n-2);
        }
    }
    public static void main(String[] args) {
        int result = f(5);
        System.out.println(result);
        int result2  = method(9);
        System.out.println(result2);
    }
}
