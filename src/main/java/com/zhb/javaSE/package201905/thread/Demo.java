package com.zhb.javaSE.package201905.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-05 16:52
 **/
public class Demo {

    public static void main(String[] args) {
        int i = 0, j = 5;
        tp:for (; ; ) {
            i++;
            for (; ; )
                if (i > --j)
                    break tp;
        }
        System.out.println("i = "+i+" j = "+j);
    }
}
