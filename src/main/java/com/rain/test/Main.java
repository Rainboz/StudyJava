package com.rain.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-19 下午2:43
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 第一组数减去第二组:a-b -->取绝对值【0，1，1】
         * 第一组数减第三组数:a-c -->取绝对值【7，7，2】
         * 第二组数减第三组数:b-c -->取绝对值【7，6，3】
         *          0   1
         *    0     1   2
         *    1     3   4
         *    2     5   6
         */
        int a[][] = {{1, 2, 3}, {4, 5, 6}};
        int b[][] = {{1, 2, 3}, {4, 6, 7}};
        int c[][] = {{5, 6, 2}, {7, 8, 5}};

        //比较差值的总和abs_sum的大小得出最优组合a,b,c
//        f(a, b, c);

        //定义和数组,输出对应行的和
        System.out.println("--------a-------");
        int a_sum[] = getSum(a);
        System.out.println("--------b-------");
        int b_sum[] = getSum(b);
        System.out.println("--------c-------");
        int c_sum[] = getSum(c);

        //第一组数减去第二组数取绝对值
        System.out.println("--------(a-b)--------");
        int[] abs_a_b = getAbs(a_sum, b_sum);

        //第一组数减第三组数:a-c
        System.out.println("--------(a-c)--------");
        int[] abs_a_c = getAbs(a_sum, c_sum);

        //第二组数减第三组数:b-c
        System.out.println("--------(b-c)--------");
        int[] abs_b_c = getAbs(b_sum, c_sum);

        //三组数，再加起来，就只有一组数了，一组数有三个值，在对它求和
        int abs_sum = getAbsSum(abs_a_b, abs_a_c, abs_b_c);
        System.out.println("差值的总和: " + abs_sum);

    }

    /**
     * 绝对值组的和
     * @param abs
     * @return
     */
    public static int getAbsSum(int[]... abs) {
        int abs_sum[] = new int[abs.length];
        int sum = 0;
        for (int i = 0; i < abs.length; i++) {
            abs_sum[i] = abs[0][i] + abs[1][i] + abs[2][i];
            //System.out.println(abs_sum[i]);
            sum += abs_sum[i];
        }
        System.out.println("和： " + Arrays.toString(abs_sum));
        return sum;
    }

    /**
     * 绝对值
     * @param arry1
     * @param arry2
     * @return
     */
    public static int[] getAbs(int[] arry1, int[] arry2) {
        int abs_sum[] = new int[arry1.length];
        for (int i = 0; i < arry1.length; i++) {
            abs_sum[i] = Math.abs(arry1[i] - arry2[i]);
            //            System.out.println("绝对值:" + abs_sum[i]);
        }
        System.out.println("绝对值： " + Arrays.toString(abs_sum));
        return abs_sum;
    }

    /**
     * 求和
     * @param arry
     * @return
     */
    public static int[] getSum(int[][] arry) {
        //先求出第一组数对应行的和【5,7,9】
        int sum[] = new int[arry[0].length];

        for (int i = 0; i < arry[0].length; i++) {
            sum[i] = arry[0][i] + arry[1][i];
            //System.out.println("sum: " + sum[i]);
        }
        System.out.println("sum: " + Arrays.toString(sum));
        return sum;
    }

    /**
     * 分组
     * @param a
     * @param b
     * @param c
     */
    public static void f(int[][] a, int[][] b, int[][] c) {
        /**
         *         int a[][] = {{4, 5, 6}, {1, 2, 3}};
         *         int b[][] = {{1, 2, 3}, {4, 6, 7}};
         *         int c[][] = {{5, 6, 2}, {7, 8, 5}};
         */
        ArrayList<int[]> list_a = new ArrayList();
        //        list_a.add(new int[]{1, 2, 3});
        //        list_a.add(new int[]{4, 5, 6});

        ArrayList<int[]> list_b = new ArrayList();
//        list_b.add(new int[]{1, 2, 3});
//        list_b.add(new int[]{4, 6, 7});

        ArrayList<int[]> list_c = new ArrayList();
//        list_c.add(new int[]{5, 6, 2});
//        list_c.add(new int[]{7, 8, 5});


        Collections.addAll(list_a, a);
        Collections.addAll(list_b, b);
        Collections.addAll(list_c, c);
        for (int i = 0; i < list_a.size(); i++) {
            /*System.out.println("---------a"+i+"---------");
            System.out.println(list_a.get(i));
            System.out.println(Arrays.toString(list_a.get(i)));


            System.out.println("---------b"+i+"---------");
            System.out.println(list_b.get(i));
            System.out.println(Arrays.toString(list_b.get(i)));


            System.out.println("---------c"+i+"---------");
            System.out.println(list_c.get(i));
            System.out.println(Arrays.toString(list_c.get(i)));*/

            //a1  b0值是一样的,hash值不一样返回false
            //使用Arrays.equals(ary1,ary2);比较两个数组
            //System.out.println(Arrays.equals(list_a.get(1),list_b.get(0)));
            //如果有相等的就不换,a,b,c一次比较，不等就换
            for (int j = 0; j < list_b.size(); j++) {
                System.out.println("i:"+i+" "+"j:"+j);
                System.out.println("a"+i+" "+"b"+j+" "+Arrays.equals(list_a.get(i),list_b.get(j)));
                System.out.println("a"+i+" "+"c"+j+" "+Arrays.equals(list_a.get(i),list_c.get(j)));
                System.out.println("c"+i+" "+"b"+j+" "+Arrays.equals(list_c.get(i),list_b.get(j)));
                if (Arrays.equals(list_a.get(i),list_b.get(j))){
                    System.out.println("不换");
                }else {
                    System.out.println("换");
                }
            }

        }
    }
}
