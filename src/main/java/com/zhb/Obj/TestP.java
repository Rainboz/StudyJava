package com.zhb.Obj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-13 上午8:44
 */
public class TestP {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(22);
        p1.setName("zhb");
        p1.setSex('男');
        Person p2 = new Person();
        p2.setAge(22);
        p2.setName("zhb");
        p2.setSex('男');
        //        p1.study();
        //        System.out.println(p1.sex);
        System.out.println(p2.hashCode()+"===="+p1.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println("p1:"+p1.toString());
        System.out.println("p2:"+p2.toString());
        Map m = new HashMap();
        Set s = new HashSet();
        s.add(p1);
        s.add(p2);
        System.out.println(s);

    }
}
