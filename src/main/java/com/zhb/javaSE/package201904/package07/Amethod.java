package com.zhb.javaSE.package201904.package07;

import java.util.Arrays;

/**
 * @program: StudyJava
 * @description: Arrays Tools
 * @author: rainboz
 * @create: 2019-04-19 08:23
 **/
public class Amethod {
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 9, 8};
        int[] a1 = {2, 3 ,4, 5, 8};
        //排序
        Arrays.sort(a);
        Arrays.toString(a);
        System.out.println(Arrays.toString(a));
        //查找数组元素
        int b = Arrays.binarySearch(a, 7777);
        System.out.println(b);
//        Arrays.fill(a,20);
        //给数组赋值
        Arrays.fill(a,1,2,20);
        System.out.println(Arrays.toString(a));
        //复制数组
        int[] bb = Arrays.copyOfRange(a,1,3);
        System.out.println(Arrays.toString(bb));

    }
}
