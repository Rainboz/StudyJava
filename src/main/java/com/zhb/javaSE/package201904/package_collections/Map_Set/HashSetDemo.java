package com.zhb.javaSE.package201904.package_collections.Map_Set;

import java.util.*;

/**
 * @program: StudyJava
 * @description: set集合特点
 * 无序（存储和读取的顺序可能不一样）
 * 不允许重复（元素唯一）
 * 没有索引（只允许存在一个null元素）
 * @author: rainboz
 * @create: 2019-05-05 11:22
 **/
public class HashSetDemo {
    public static void main(String[] args) {
        //HashSet<String> hs = new HashSet<>();
        Set<String> set = new HashSet<>();//父接口指向子类对象

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");

        //遍历集合对象

        //转数组
        method(set);
        System.out.println("----------------------");
        //迭代器
        method2(set);
        System.out.println("----------------------");
        //增强for循环
        for (String s : set) {
            System.out.println(s);
        }
    }

    public static void method2(Set<String> set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void method(Set<String> set) {
        Object[] obj = set.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}
