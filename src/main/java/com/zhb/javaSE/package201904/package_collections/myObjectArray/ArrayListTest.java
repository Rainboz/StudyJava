package com.zhb.javaSE.package201904.package_collections.myObjectArray;

import java.util.ArrayList;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-29 18:21
 **/
public class ArrayListTest {
    public static void main(String[] args) {
        //定义字符串数组
        String[] str = {"张三丰", "宋远桥", "张无忌", "殷梨亭", "张翠山", "莫声谷"};
        //创建集合对象
        ArrayList<String> array = new ArrayList<>();
//        array.add("张三丰");
//        array.add("宋远桥");
//        array.add("张无忌");
//        array.add("殷梨亭");
//        array.add("张翠山");
//        array.add("莫声谷");
        //遍历字符串数组，获取每一个元素值，并将元素添加到集合中
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            System.out.println("字符串数组:"+s);
            array.add(s);
        }
        //遍历集合，获取元素，
        //判断每个字符串元素是否以‘张’开头，如果是，则输出
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            if (s.charAt(0) == '张')
                System.out.println("以‘张’开头:"+s);
            if (s.startsWith("莫"))
                System.out.println("以‘莫’开头:"+s);
        }

    }
}
