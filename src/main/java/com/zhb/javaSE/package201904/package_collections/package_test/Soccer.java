package com.zhb.javaSE.package201904.package_collections.package_test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * @program: StudyJava
 * @description:科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，中国，
 * 新西兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利
 * @author: rainboz
 * @create: 2019-04-28 16:52
 **/
public class Soccer
{
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("科特迪瓦");
        list.add("阿根廷");
        list.add("澳大利亚");
        list.add("塞尔维亚");
        list.add("荷兰");
        list.add("尼日利亚");
        list.add("日本");
        list.add("美国");
        list.add("中国");
        list.add("新西兰");
        list.add("巴西");
        list.add("比利时");
        list.add("韩国");
        list.add("喀麦隆");
        list.add("洪都拉斯");
        list.add("意大利");
        List<String> s = new ArrayList<>();

        Random r = new Random();
        String b;
        for (int i = 1; i <= 4; i++) {

            System.out.println(i+"组");
            for (int j = 0; j < 4; j++) {
                b = list.get(r.nextInt(list.size()));
                System.out.println("  "+b);
                list.remove(b);
            }
            System.out.println("\n");
        }
        Object[] obj = s.toArray();
        for (Object x:obj){
            System.out.println(x);
        }
        ListIterator i = list.listIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
