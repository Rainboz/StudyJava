package com.zhb.javaSE.test_20190517;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-17 下午12:31
 **/
public class T6 {
    public static void main(String[] args) {
        String[] str = new String[2];
        str[0] = new String("adf1f23");
        str[1] = new String("ju34ui21");
        int num1 = Integer.valueOf(getNum(str[0]));
        int num2 = Integer.valueOf(getNum(str[1]));
        int result = num1+num2;
        System.out.println("str[0]中的数字："+num1);
        System.out.println("str[1]中的数字："+num2);
        System.out.println("每个字符串中所有数字合成的数字相加为："+result);
    }

    //str[i]
    public static String getNum(String str) {
        char[] ch = str.toCharArray();
        String str_num="";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] < '9') {
                str_num += ch[i];
            }

        }
        return str_num;
    }
}

