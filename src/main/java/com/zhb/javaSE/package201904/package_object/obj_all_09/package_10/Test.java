package com.zhb.javaSE.package201904.package_object.obj_all_09.package_10;

import java.util.Arrays;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-24 18:12
 **/
public class Test {
    public static void main(String[] args) {
        int[] a = {1,2};
        User user = new User(a);
        //追加一个值
        System.out.println("a加值，返回b"+Arrays.toString(user.add(1)));
        System.out.println("a"+Arrays.toString(a));
        System.out.println("0下标的值"+user.get(0));
        System.out.println("0下标的值"+user.get(1));
        System.out.println("a的长度"+user.size());
        System.out.println("a"+Arrays.toString(a));
        System.out.println("b"+Arrays.toString( user.add(1,10)));
        user.set(1,45);
        System.out.println("a"+Arrays.toString(a));
        a = user.remove(a,1);
        for (int x :a){
            System.out.println("x="+x);
        }
    }
}
