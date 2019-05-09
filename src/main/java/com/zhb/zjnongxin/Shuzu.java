package com.zhb.zjnongxin;

import java.util.Arrays;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-27 20:51
 **/
public class Shuzu {
    static int n = 10;

    public static void main(String[] args) {
        System.out.println(m());
    }

    public static String m() {
        int a[] = {1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9};
        int b[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            aa:for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                if (count == 2) {
                    for (int k = 0; k < b.length; k++) {
                        if (b[k] == 0) {
                            b[k] = a[i];
                            continue aa;
                        }

                    }
                }
            }
        }
        return Arrays.toString(b);
    }
}