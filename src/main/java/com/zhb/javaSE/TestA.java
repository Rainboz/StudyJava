package com.zhb.javaSE;

public class TestA {
    private int i ;
    private void change(int i){
        i++;
        System.out.println(i);
    }
    private void change1(TestA t){
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
