package com.zhb.mysql.package_201905;

import java.util.Arrays;

/**
 * @program: StudyJava
 * @description: 16进制转10进制
 * @author: rainboz
 * @create: 19-5-7 下午6:50
 **/
public class Test {
    public static void main(String[] args) {
        int i = 0xB3000;
        int j = 0xDABFF;
        int result1 = method(i);
        System.out.println("-------------------------------------------------");
        int result2 = method(j);
        System.out.println(result2-result1);
    }

    private static int method(int i) {
        String str1 = Integer.toBinaryString(i);
        System.out.println("原值二进制："+str1);
        StringBuilder sb1 = new StringBuilder(str1);
        sb1.reverse();
        char[] ch1 = sb1.toString().toCharArray();
        int sum1 = 0;
        System.out.println("反转："+Arrays.toString(ch1));
        for (int k = 0; k < ch1.length; k++) {
            if (ch1[k] == '1'){
                sum1 += Math.pow(2,k);
                System.out.println("每个位的值2的k次方，(k为1的索引)："+Math.pow(2,k));
                System.out.println(sum1);
            }
        }
        return sum1;
    }
}

