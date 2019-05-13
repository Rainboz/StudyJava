package com.zhb.LintCode.employees;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @program: StudyJava
 * @description: 字符串相乘:不能用大数类型（BigInteger）或转为整数处理
 * @author: rainboz
 * @create: 19-5-8 上午8:44
 **/
public class T3 {
    public static void main(String[] args) {
        //两个字符串非负整数，num1,num2,返回num1,num2的乘积，返回值为string
        String num1 = "6466464312168463213543543513543843435135435438438434341354354343";
        String num2 = "6466464312168463213543543513543843435135435438438434341354354343";
        //method(num1,num2);
//        BigIntegerTo(num1, num2);

        //比较两种计算方法是否相等
        String result1 = method(num1, num2);
        BigInteger result2 = BigIntegerTo(num1, num2);
        System.out.println("big to string " + result2.toString() + "   |||  string   " + result1);
        if (result1.equals(result2.toString())) {
            System.out.println(result1 + "=" + result2);
        } else {
            System.out.println(result1 + "不等于" + result2);
        }
    }

    private static BigInteger BigIntegerTo(String num1, String num2) {
        //用大数类型（BigInteger）
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
//        System.out.println(b1+"*"+b2+"="+b1.multiply(b2));
        return b1.multiply(b2);
    }

    private static String method(String num1, String num2) {
        /*
         *    123
         *  x 456             18         8
         * ———————        15  12    28   8
         *    738     12  10   6    30   0
         *   615      8   5         16   6
         *  492       4             5    5
         * ———————
         *  56088
         *
         * 进位：两位数第一个字符为进位，1-8，如果为一位就表示没有进位
         * num1,num2 的长度小于110
         * num1,num2 包含0-9
         * num1,num2 不以0开头，除非是数字0
         *
         */
        int len1 = num1.length();
        int len2 = num2.length();
        int[] lv = new int[len1 + len2];//依次乘3*3=9次,用于存放乘积值
//        System.out.println("num1.len1="+len1+"--"+"num2.len2="+len2);
        /*                       2*2=18
         *              2*1=15   1*2=12
         *      2*0=12  1*1=10   0*2=6
         *      1*0=8   0*1=5
         *      0*0=4
         *
         *
         */
        System.out.println("-----------------------method()开始!!!-----------------------------");
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int pro = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                lv[i + j + 1] += pro;
                //System.out.println(Arrays.toString(lv));//添加依次乘积
            }
        }
        int add = 0;
        for (int i = lv.length - 1; i >= 0; i--) {
            int temp = (lv[i] + add) % 10;//加上进位后结果
            add = (lv[i] + add) / 10;//取进位值
            lv[i] = temp;//赋值进位后的结果给数组lv
        }
        System.out.println("进位后的结果：" + Arrays.toString(lv));
        //将数组中的元素添加到StringBuilder sb 中
        StringBuilder sb = new StringBuilder();
        for (int x : lv) {
            sb.append(x);
        }
        //处理int[] lv中的结果，前面有0则去除。
//        System.out.println(sb);
        String str = sb.toString();
        if (str.length() > 0 && str.charAt(0) == '0') {
            str = str.substring(1);
        }
        System.out.println("method():" + num1 + "*" + num2 + "=" + str);
        System.out.println("-----------------------method()结束!!!-----------------------------");
        return str;
    }
}

