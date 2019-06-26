package com.zhb.javaSE.test_20190517;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-17 下午12:24
 **/
public class T4 {
    public static void main(String[] args) {
        String name[] = {"祝海波", "徐子鹏", "张中国", "林树", "黄万吉", "王辉", "吴雅婷", "杨帆", "凌晓蔚", "老王"};
        ArrayList<String> a = new ArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(name[i]);
        }
        pickNames(a);

    }

    private static void pickNames(ArrayList<String> a) {
        Collections.shuffle(a);
        for (int i = 0; i < 5; i++) {
            System.out.println(a.get(i));
        }
    }
}

