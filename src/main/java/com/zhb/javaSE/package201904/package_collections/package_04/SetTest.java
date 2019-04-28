package com.zhb.javaSE.package201904.package_collections.package_04;

import java.util.*;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-28 17:48
 **/
public class SetTest {
    public static void main(String[] args) {
        StackTest();
        method7();
        Set s = new HashSet();
        s.add("zhb");
        s.add("zfa");
        s.add("zg");
        s.add("xzp");
        s.add("zhb");
        for (Object x :s){
            System.out.println(x);
        }
        System.out.println("---------------------");
        Iterator it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
    public static void StackTest(){
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < 11; i++) {
            s.push(i);
        }
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());

    }
    public static void method7(){
        /**
         *功能描述 @description: TODO 22选5
         * @date 19-4-28 下午6:14
         * @param []
         * @return void
         */
        Set<Integer> s = new HashSet<>();
        Random r = new Random();
        for (int i = 1; s.size() < 5; i++) {//s.size() < 5
            s.add(r.nextInt(22)+1);//[0,22)要+1--->[1,23)
        }
        System.out.println("=="+s);
    }
}
