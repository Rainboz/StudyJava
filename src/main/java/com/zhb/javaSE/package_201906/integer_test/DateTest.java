package com.zhb.javaSE.package_201906.integer_test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-06-16 15:56
 **/
public class DateTest {
    private int i = 2;
    public static void main(String[] args) throws CloneNotSupportedException {
        //method1();
        method2();
        //method3();

    }

    public static void method3() {
        // 定义一个整型数组，长度为10
        int[] nums = new int[10];
        //通过循环给数组赋值
        for (int i = 0; i < nums.length; i++) {
            // 产生10以内的随机数
            int x = (int) (Math.random()*10);

            nums[i] = x;// 为元素赋值
        }
        // 使用foreach循环输出数组中的元素
        for (int num:nums){
            System.out.println(num + " ");
        }
    }

    public static void method2() {
        // 创建Calendar对象
        Calendar c = Calendar.getInstance();

        // 将Calendar对象转换为Date对象
        Date date = c.getTime();

        // 创建SimpleDateFormat对象，指定目标格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int result = c.getWeekYear();
        System.out.println(result);
        // 将日期转换为指定格式的字符串
        String now = sdf.format(date);
        System.out.println("当前时间：" + now);
    }

    public static void method1() {
        Date d = new Date();
        System.out.println(d);
        //使用 format() 方法将日期转换为指定格式的文本
        //创建SimpleDateFormat对象，指定目标格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //调用format()方法，格式时间
        String today = sdf.format(d);
        System.out.println(today);
    }
}
