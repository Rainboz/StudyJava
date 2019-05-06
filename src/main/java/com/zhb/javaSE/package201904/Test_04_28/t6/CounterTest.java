package com.zhb.javaSE.package201904.Test_04_28.t6;

import org.junit.Test;

import java.util.Arrays;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-05 20:16
 **/
public class CounterTest {
    Counter c = new Counter();
    int[] array = {1, 5, 4, 2};

    @Test
    public void testSort() {
        c.sort(array);
        System.out.println("从小到大排序："+Arrays.toString(array));
    }

    @Test
    public void testMax() {
        int result = c.max(array);
        System.out.println("最大值："+result);
    }
    @Test
    public void testAvg() {
        int result =c.avg(array);
        System.out.println("平均值："+result);
    }
    @Test
    public void testSum() {
        int result =c.sum(array);
        System.out.println("总和："+result);
    }
}
