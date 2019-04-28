package com.zhb.javaSE.package201904.package_collections.package_02;

import java.util.*;

/**
 * @program: StudyJava
 * @description: 1.2.2编写一个ArrayList类，用来存储1到10之间的数，打乱顺序后输出，按从小到大输出，按从大到小输出。
 * @author: rainboz
 * @create: 2019-04-28 15:26
 **/
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println("乱序："+list);
        Collections.sort(list);
        System.out.println("升序："+list);
        Collections.reverse(list);
        System.out.println("降序："+list);

        ListIterator it = list.listIterator();
        System.out.println("正序：");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("逆序：");
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
