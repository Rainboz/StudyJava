package com.zhb.javaSE.test_20190517;

import java.io.File;
import java.util.Scanner;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-17 下午1:15
 **/
public class T2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("请正确输入文件的目录:");
        String str = kb.next();
        File a = new File(str);
        showName(a);
    }

    public static void showName(File f) {
        if (f.isDirectory()) {
            String[] b = f.list();

            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);
                File a1 = new File(f, b[i]);
                showName(a1);
            }
        } else {
            System.out.println(f);
        }
    }
}

