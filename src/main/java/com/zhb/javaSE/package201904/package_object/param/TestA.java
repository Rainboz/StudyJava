package com.zhb.javaSE.package201904.package_object.param;

/**
 * @program: StudyJava
 * @description: A
 * @author: rainboz
 * @create: 2019-04-19 18:48
 **/
public class TestA {
    int i ;
    void change(int i){
        i++;
        System.out.println(i);
    }
    void change1(TestA t){
        t.i++;
        System.out.println(t.i);
    }
    public static void main(String[] args) {
        TestA ta = new TestA();
        System.out.println(ta.i); //0
        ta.change(ta.i);//1
        System.out.println(ta.i); //0
        ta.change1(ta);  //1
        System.out.println(ta.i);//1
    }
}
