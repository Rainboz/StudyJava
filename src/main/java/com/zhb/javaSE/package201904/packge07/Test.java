package com.zhb.javaSE.package201904.packge07;

import java.util.*;

/**
 * @program: StudyJava
 * @description: test
 * @author: rainboz
 * @create: 2019-04-17 20:28
 **/
public class Test {
    /**
     * 9.数组a[n]，用java代码将数组元素顺序颠倒
     */
    public static void method(int[] a){
        int len = a.length;
        for (int i = 0; i < len/2; i++) {  //1234
            int temp = 0;
            temp = a[i];
            a[i] = a[len-1-i];//0  =  4-1-0  1 = 4-1-1
            a[len-1-i] = temp;
        }
    }
    public static void method2(){
        int[] aa =new int[10];
        for (int i = 0; i < aa.length; i++) {
            aa[i] = i;
        }
        System.out.println(Arrays.toString(aa));
//        Arrays.asList(aa);
//        List<Integer> list =new ArrayList<Integer>();
//        Collections.reverse(Collections.singletonList(aa));
//        System.out.println(Arrays.toString(aa));
    }

    public static void main(String[] args) {
        float[] f2=new float[1];
        boolean[] b={true,false,true};
        double f4[]={1,3,5};
        int f5[]=new int[3];
        float f6[]={1.2F,3.0f,5.4f};
        int[] a = {(int) (Math.random()*1000),(int) (Math.random()*1000),(int) (Math.random()*1000),(int) (Math.random()*1000)};
        System.out.println("数组元素顺序颠倒前："+Arrays.toString(a));
        method(a);
        System.out.println("数组元素顺序颠倒后："+Arrays.toString(a));
        System.out.println("------------------ method2-------------------");
        method2();

        System.out.println("------------------- method3------------------");
    }
}
