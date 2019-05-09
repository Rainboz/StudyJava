package com.zhb.javaSE.package201904.Test_04_28.t6;

import java.util.Arrays;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-05 20:10
 **/
public class Counter {
    public void sort(int[] array){
        //排序
        Arrays.sort(array);
    }
    public int max(int[] array){
        //最大值
        Arrays.sort(array);
        return array[array.length-1];
    }
    public int avg(int[] array){
        //平均值
        return (sum(array))/(array.length);
    }
    public int sum(int[] array){
        //总和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
