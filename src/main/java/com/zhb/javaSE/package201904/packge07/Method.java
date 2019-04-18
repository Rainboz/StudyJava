package com.zhb.javaSE.package201904.packge07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: StudyJava
 * @description: arrays method
 * @author: rainboz
 * @create: 2019-04-18 15:19
 **/
public class Method<pu> {
    /**
     * 14.在一个由5个元素组成的一维数组中 查找一个数字‘5’，如果该有数组中有此元素，由提示“数字5在此数组中”
     * @param a:shuzu
     */
    public void method1(int[] a){
        //int a[] = {1,2,355,5};
        //        int b[] = {1,2,355,12};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 5){
                System.out.println("数字5在此数组中"+"下标为："+i+"值："+a[i]);
            }else {
                System.out.println("在数组"+ a +"未找到5");
            }
        }
    }
    /**
     * 13.定义一个10个元素组成的一维数组，求该数组中的最大值，以及最大值在该数组中的位置
     */
    public void method2(int[] a){
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (max <= a[i]){
                max = a[i];
                //a[0] = a[i];
                index = i;
            }
        }
        System.out.println("数组中最大值为："+max+" 下标为："+index);
    }
    /**
     * 18.静态初始化一维数组{10，20，11，35，6,89}，进行冒泡排序
     */
    public  int[] method3(int[] a){
        int temp = 0;
        System.out.println("原數組："+Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                System.out.println("數組j层循环："+Arrays.toString(a));
            }
            System.out.println("數組i层循环=========："+Arrays.toString(a));
        }
        System.out.println("數組："+Arrays.toString(a));
        return a;
    }
    /**
     * 19.静态初始化二维数组 {{1}，{2，3}，{4，5，6}}，输出每个元素的值
     */
    public void method4(int[][] a){
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(Arrays.toString(a[i]));
//        }
        for (int[] x:a){
            System.out.println(Arrays.toString(x));
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
    /**
     *  	int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;
     * 要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组
     */
    public void method5(int[] a){
        int len = a.length;
        int count = 0;
        for (int x:a){
            if (x != 0){
                count++;
            }
        }
        int newArr[] = new int[count];
        int k = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] != 0){
                newArr[k++] = a[i];
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
    /**
     * 两个数组合并为数组c，按升序排列。
     *    	主要的目的是熟悉这两个操作的方法，数组扩大，必须要将原始数组的内容拷贝进去。
     */
    public void method6(int[] a,int[] b){
        int[] c = Arrays.copyOf(a, a.length+b.length);
        for(int i=a.length;i<c.length;i++){
            c[i]=b[i-a.length];
            //System.out.print(c[i]+" ");
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
    /**
     * 杨辉三角如下：
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     * ……
     * 例如：
     * 1 4 6 4 1 的下一行
     * 1 a1 a2 a3 a4 1
     * a1 = 4 + 1 = 5
     * a2 = 6 + 4 = 10
     * a3 = 4 + 6 = 10
     * a4 = 1 + 4 = 5
     * 依次类推。
     * 要求：读入一个整数n，输出杨辉三角的前n 行
     */
    public void method7(int n){
        int a[][] = new int[n][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i+1];//重要
            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
                if(i==0||j==0||j==i){
                    a[i][j]=1;
                }else{// 其他数值通过公式计算
                    a[i][j]=a[i-1][j]+a[i-1][j-1];//重要
                }
                System.out.print(a[i][j]+"\t");         // 输出数组元素
            }
            System.out.println("");
        }
    }
    /**
     * 24.数组的插入和删除
     *    定义一个长度为10的数组，通过控制台的输入，
     *  	1.向数组中指定的位置中插入一个新元素
     *  	2.删除指定位置的元素
     */
    public <T> T[] arraySpeDel(T[] content, T specific) {

        int len = content.length;
        for (int i = 0; i < content.length; i++) {
            if (content[i].equals(specific)) {
                System.arraycopy(content, i + 1, content, i, len - 1 - i);
                break;
            }
        }
        return Arrays.copyOf(content, len - 1);
    }
}
