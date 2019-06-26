package com.zhb.javaSE.test_20190517;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-17 下午12:47
 **/
public class T8 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(6);
        array.add(8);
        array.add(7);
        array.add(7);
        array.add(8);
        array.add(2);
        array.add(2);
        array.add(1);
        array.add(2);
//        System.out.println(array);
        /**
         * 将重复元素找出，并按数字大小排序
         * 1：2次
         * 2：4次
         * 3：1次
         * 6：1次
         * 7：3次
         * 8：2次
         */
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.size(); i++) {
            set.add(array.get(i));
        }

        for (Integer i : set) {
            int count = 0;
            for (int j = 0; j < array.size(); j++) {
                if (i == array.get(j)) {
                    count++;
                }
            }
            System.out.println(i + ":" + count + "次");
        }

    }
}

