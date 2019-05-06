package com.zhb.javaSE.package201904.Test_04_28.t4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: StudyJava
 * @description: 回文
 * @author: rainboz
 * @create: 2019-05-05 22:46
 **/
public class huiwen {
    public static void main(String[] args) {

        reverse();
        System.out.println("====================================================");
        reverse2();

    }


     /*
      *功能描述 @description: TODO int-->String-->arrayList.add()-->
      *                    字符串String str1 = arrayList.get(i);-->char[]-->
      *                    反转-->char[]-->String str2 = new String(ch);
      * @date 19-5-6 上午12:07
      * @param []
      * @return void
      */
    private static void reverse2() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int j = 10000; j <= 99999; j++) {
//            System.out.println(j);
            arrayList.add(String.valueOf(j));
        }
        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println("yuan:"+arrayList.get(i));
            String str1 = arrayList.get(i);
            char[] ch = arrayList.get(i).toCharArray();
            for (int start = 0, end = ch.length - 1; start <= end; start++, end--) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
            }
            String str2 = new String(ch);
            if (str1.equals(str2)) {
                System.out.println("原值：" + str1 + "=" + "反转：" + str2);
            }
//            System.out.println("反转："+ss);
        }
    }
    /*
     *功能描述 @description: TODO String-->StringBuilder-->reverse()-->String
     *                    1.str = String.valueOf(i);
     *                    2.StringBuilder sb = new StringBuilder(str);
     *                    3.sb.reverse();
                          4.String str1 = sb.toString();
     *
     * @date 19-5-6 上午12:11
     * @param []
     * @return void
     */
    private static void reverse() {
        String str;
        for (int i = 10000; i <= 99999; i++) {
            str = String.valueOf(i);
//            System.out.println("原值："+str);
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            String str1 = sb.toString();
//            System.out.println("reverse："+str1);
            if (str.equals(str1)) {
                System.out.println("原值：" + str + "=" + "反转：" + str1);
            }
        }
    }
}
