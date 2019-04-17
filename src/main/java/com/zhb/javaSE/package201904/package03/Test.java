package com.zhb.javaSE.package201904.package03;
//实验03_表达式.doc
public class Test {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        System.out.println( ((a >= b) == (b == c) == (c<a)) );//((false)==(false)==(false))
        System.out.println( (a!=b)==(a!=c)==(c==a) );//(ture==ture==false)
        System.out.println(!(a > b));//!(false):ture
    }
}
