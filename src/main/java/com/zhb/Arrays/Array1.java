package com.zhb.Arrays;

import org.apache.commons.collections.map.HashedMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Array1 {
    public static void main(String[] args) {
        Pritimive d = new Pritimive();
        for (int i = 0; i < d.t.length; i++) {
            System.out.println(d.t[i]);
            System.out.println(d.t.clone()[i]);
            Map a = new HashMap();
            Set s = new HashSet();
            String s1 = "1";
            String s2 = "1";
            if (s1.equals(s2)){

            }
        }
    }

}
