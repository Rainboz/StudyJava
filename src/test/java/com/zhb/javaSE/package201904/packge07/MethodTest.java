package com.zhb.javaSE.package201904.packge07;

import org.junit.Test;

import static org.junit.Assert.*;

public class MethodTest {
    Method method = new Method();
    @Test
    public void method1() {
        int a[] = {1,2,355,5};
        int b[] = {1,2,355,12};
        method.method1(a);
        method.method1(b);
    }
    @Test
    public void method2() {
        int a[] = {1,4454,355,5};
        int b[] = {111,2,4,12111};
        method.method2(a);
        method.method2(b);
    }
    @Test
    public void method3(){
        int[] a = {10,20,11,35,6,89};
        int[] b = {31,20,11,35,6,8};
        method.method3(a);
        method.method3(b);
    }
    @Test
    public void method4(){
        int[][] a =  {{1},{2,3},{4,5,6}};
        method.method4(a);
    }
    @Test
    public void method5(){
        int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        method.method5(oldArr);
    }
    @Test
    public void method6(){
        int a[] = {1,7,9,11,13,15,17,19};
        int[] b = {2,4,6,8,10};
        method.method6(a,b);
    }
    @Test
    public void method7(){
        method.method7(5);
    }
}