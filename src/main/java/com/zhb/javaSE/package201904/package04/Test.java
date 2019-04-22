package com.zhb.javaSE.package201904.package04;

import java.math.BigInteger;
import java.util.Arrays;
//实验04_分支.doc
public class Test {
    /*排序
     * 冒泡*/
    public static int[] method1(int[] c){
        int temp = 0;
        for (int i = 0; i < c.length-1; i++) {
            for (int j = 0; j < c.length-1-i; j++) {
                if(c[j] > c[j+1]){
                    temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) throws NoSuchFieldException {
        int[] a = {2,1,4,5,3};
        method1(a);
        System.out.println(Arrays.toString(a));
        int jk = 89;
        byte kk = 0;
        int jj = (jk + kk);
        System.out.println(Integer.class.isInstance(kk));
        System.out.println(Integer.toHexString(jk));
        System.out.println(Integer.toBinaryString(jk));
        System.out.println(Integer.toOctalString(jk));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(12);
        stringBuilder.append(5454);

    }
}
