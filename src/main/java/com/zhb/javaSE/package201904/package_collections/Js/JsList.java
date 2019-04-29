package com.zhb.javaSE.package201904.package_collections.Js;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-28 22:56
 **/
public class JsList {
    public static void main(String[] args) {
        new JsList(15, 1, 7);
    }

    public JsList(int number, int start, int distance) {
   /*     List<String> list = new LinkedList<>();
        for (int i = 1; i < 16; i++) {
            list.add(i + "");
        }
//        ListIterator i = list.listIterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
        System.out.println(list.toString());
        int i = start;
        while (list.size() > 1) {
            i = (i+distance-1)%list.size();



        }*/
        List<String> list = new LinkedList<String>();//直接利用java中自带的LinkedList
        for (int i = 0; i < number; i++) {
            list.add(i+"");
        }
        System.out.print("约瑟夫环(" + number + "," + start + "," + distance + "),");
        System.out.println(list.toString());
        int i = start;
        while (list.size() > 1) {
            System.out.println(list.size());
            i = (i + distance - 1) % list.size();
            System.out.println("=========="+i);
            System.out.print("删除的元素：" + list.remove(i).toString() + ",");
            System.out.println(list.toString());
        }
        System.out.println("被赦免的罪犯是：" + list.get(0).toString());
    }
}
