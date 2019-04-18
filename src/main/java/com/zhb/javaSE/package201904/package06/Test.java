package com.zhb.javaSE.package201904.package06;

import java.util.Arrays;

/**
 * @program: StudyJava
 * @description: 实验06_循环.doc
 * @author: rainboz
 * @create: 2019-04-16 23:48
 **/
public class Test {
    /**
     *九九乘法表
     */
    public static void method1(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

    /**
     *1—100之间的所有质数
     * 质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数。
     */
    public static void method2(){
        boolean flag;
        for (int i = 2; i <=100 ; i++) {
            flag = false;
            for (int j = 2;j < i;j++) {
                if (i % j == 0){
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                System.out.print(i+",");
        }
    }

    /**
     * 4.输入长和宽，输出长方形，如：输入4和3, 将输出如下图形
     * ####
     * ####
     * ####
     * 将i和j层的条件边值替换成输入值即可
     */
    public static void method3(){
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    /**
     * 6.输入高度，输出倒直角三角形。如：输入4, 将输出如下图形
     * ####
     * ###
     * ##
     * #
     */
    public static void method4(){
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.printf("#");
            }
            System.out.println("");
        }
    }

    /**
     * 5.输入高度，输出直角三角形。如：输入4, 将输出如下图形
     * #
     * ##
     * ###
     * ####
     */
    public static void method5(){
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("#");
            }
            System.out.println("");
        }
    }

    /**
     *     *
     *    * *
     *   * * *
     *  * * * *
     * * * * * *
     *  * * * *
     *   * * *
     *    * *
     *     *
     */
    public static void method6(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    /**
     *13.一个数如果恰好等于它的因子之和，这个数就称为"完数"。（因子：除去这个数本身正的约数）
     * 例如6=1＋2＋3.编程 找出1000以内的所有完数
     */
    public static void method7(){
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0){
                    sum += j;
                }
            }
            if (sum == i){
                System.out.println(i);
                count++;
            }
            sum = 0;
        }

        System.out.println(count);
    }

    /**
     * 14.写一个程序，找出4位数的所有吸血鬼的数字
     * 例如：1260=21*60
     *      1827=21*87
     * 吸血鬼数字是指位数为偶数的数字，可以由一对数字相乘而得到，
     * 而这对数字各包含乘积的一半位数的数字，其中从最初的数字可以任意排序。以两个0结尾的数字是不允许的
     * 问题1：j1 <= 9 =没了
     * 问题2：if (itojk(i,j/10,j1,k/10,k1)) if没有加
     * 问题3：j/10 k/10 ,没有取
     */
    public static void method8(){//C42  12种组合
        for (int i = 1001; i <= 9999 ; i++) {
            if (i % 100 != 0){
                //System.out.println(i);
                for (int j = 0; j < 100; j+=10) {
                    if (j != 0){//j:10 20 30 40 50 60 70 80 90
                        for (int j1 = 0; j1 <= 9 ; j1++) {//j1:0 1 2 3 4 5 6 7 8 9
                            for (int k = 0; k < 100; k+=10) {//k:10 20 30 40 50 60 70 80 90
                                for (int k1 = 0; k1 <= 9; k1++) {//k1:0 1 2 3 4 5 6 7 8 9
                                    if ((k+k1)*(j+j1) == i){
                                        //j/10 ,j1 ,k/10 ,k1 在i中出现即为吸血鬼数
                                        //分解i与上面四个数比较
                                        if (itojk(i,j/10,j1,k/10,k1)) {
                                            System.out.println(i + "=" + (j + j1) + "*" + (k + k1));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static boolean itojk(int i,int j,int j1,int k,int k1){
        int i1[] = {i % 10,i / 10 % 10,i / 100 % 10,i / 1000};
        int jk[] = {j,j1,k,k1};
        Arrays.sort(i1);
        Arrays.sort(jk);
        if (Arrays.equals(i1,jk))
        {
            return true;
        }else {
            return false;
        }

    }

    /**
     * 30.百钱买百鸡，有100元钱，要去买100只鸡，公鸡5元一只，母鸡3元一只，小鸡1元3只，问公，母，小鸡各买多少只。
     * 提示： a+b+c=100只
     *       5a+3b+1/3c=100钱   15a+9b+c=300
     *       14a+8b=200
     *       7a+4b=100
     * 满足：7a+4b=100 && a+b+c=100
     * @param money:有100元钱
     * @param sum:买100只鸡
     */
    public static void method9(int money,int sum){
        int a = 0,b = 0,c = 0;
//        sum =  a+b+c;
//        money = 7*a+4*b;
        for (int i = 1; i < 100; i++) {//满足：7a+4b=100 && a+b+c=100
            ++a;
            b = (100-7*a)/4;
            c = 100-a-b;
            if (((sum == (a + b + c))) && a > 0 && b > 0 && c > 0 && ((money == (7 * a) + (4 * b)))){
                System.out.println("公: "+a+"只，母: "+b+"只，小鸡: "+c+"只");
            }
        }
    }

    /**
     * 34.求两个数之间的素数（300-400）
     */
    public static void method10(int begin,int end){
        boolean flag;
        for (int i = begin > 1 ? begin : 2; i <= end; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(begin+"-"+end+"素数："+i+" flag: "+flag);
            }
        }


    }

    /**
     * 35.用while做 鸡兔同笼。鸡兔一共有50只，脚一共有160只，问鸡和兔各多少只?要求鸡兔至少一样一只
     *a+b==50
     *2a+4b==160
     */
    public static void method11(){
        int a = 0;
        int b = 0;
        for (int i = 1; i <= 50; i++) {
            a++;
            b = 50-a;
            if ((a+b==50) && (2*a+4*b==160) && a>=1 && b>=1){

                System.out.println("鸡有："+a+"只 "+"兔有："+b+"只");
            }
        }

    }

    /**
     * 36.计算2/1+3/2+4/3+…+(n+1)/n，写出算法的程序
     */
    public static void method12(int n){
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum+=((i+1)/i);//2/1+3/2
        }
        System.out.println("2/1+3/2+4/3+…+(n+1)/n结果为："+sum+" 此时n为: "+n);
    }

    /**
     * 37.2000年我国人口为13亿，如果人口每年的自然增长率为7%，那么多少年 后我国人口将达到15亿？设计一个算法的程序
     */
    public static void method13(){
        double a = 13;
        double percent = 0.07;
        int i = 0;
//        for (; a>=15; a++) {
        while (a <= 15) {
            a = a * (1 + percent);
            i++;
        }
//        }
       // i = i-1;看i的初值
        System.out.println("达到或超过15亿人口需要的年数为："+i);
    }

    /**
     * 38.给出50个数，1，2，4，7，11，„，其规律是：第1个数是1，第2个数比第1个数大1，第3个数比第2个数大2，第4个数比第3个数大3，„，
     * 以此类推. 要求计算这50个数的和
     */
    public static void method14(int n){       // 0 1 2 3 4
        int sum = 0;
        int index = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {//a[]:1 2 4 7 11 16 22 ...
            /*已知：a[i+1]-a[i]=i+1;a[0]=1;  a[i]-a[i-1] = i i>0
                                            a[0]=1          i=0
            */
            if (i == 0){
                a[0] = 1;
                sum += 1;
            }else if (i > 0){//a[1]-a[0]=1
//                a[i]-a[i-1] = i;
                a[i] = i+a[i-1];
                sum += a[i];
            }
        }
        System.out.println(n+"个数的和: "+sum);
    }

    /**
     * 39.有个人想知道，一年之内一对兔子能繁殖多少对？于是就筑了一道围墙把一对兔子关在里面。
     * 已知一对兔子每个月可以生一对小兔子，而一对兔子从出生后第3个月起每月生一对小兔子。假如一年内没有发生死亡现象，
     * 那么，一对兔子一年内（12个月）能繁殖成多少对？
     * 分析：兔子的规律为数列，1，1，2，3，5，8，13，21  34  55  89  144
     *                     1  2  3  4 5  6  7  8  9   10  11  12
     */
    public static void method15(int n){//2->4
        int a[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {//a[i+2]=a[i]+a[i+1]
             if (i<2){
                 a[i] = 1;
                 sum = a[i];
             }else if (i >= 2){
                 a[i]=a[i-2]+a[i-1];
                 sum = a[i];
             }
        }
        System.out.println("一对兔子"+n+"个月内能繁殖成"+sum+"对");
    }

    /**
     * 40.水仙花数（Narcissistic number）也被称为超完全数字不变数、自恋数、自幂数，
     * 水仙花数是指一个 n 位数（n≥3 ），它的每个位上的数字的 n 次幂之和等于它本身（
     * 例如：1^3 + 5^3+ 3^3 = 153）,
     * 请通过程序找出所有的3位数的水仙花数（穷举法）
     */
    public static void method16(){
        for (int i = 100; i < 1000; i++) {
            int a = i/100;//百位
            int b = i/10%10;//十位
            int c = i%10;//个位
            if (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3) == i){
                System.out.println("所有的3位数的水仙花数："+i);
            }
//            System.out.println("百位: "+a+" 十位: "+b+" 个位: "+c);
        }
    }
    public static void method0(){}
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
        System.out.println("---------------method4-----------------");
        method4();
        System.out.println("---------------method5-----------------");
        method5();
        System.out.println("---------------method6-----------------");
        method6();
        System.out.println("---------------method7-----------------");
        method7();
        System.out.println("---------------method8-----------------");
        method8();
        System.out.println("---------------method9-----------------");
        method9(100,100);
        System.out.println("---------------method10-----------------");
        method10(300,400);
        System.out.println("---------------method11-----------------");
        method11();
        System.out.println("---------------method12-----------------");
        method12(2);
        System.out.println("---------------method13-----------------");
        method13();
        System.out.println("---------------method14-----------------");
        method14(50);
        System.out.println("---------------method15-----------------");
        method15(4);
        method15(5);
        method15(6);
        method15(7);
        method15(8);
        method15(9);
        method15(10);
        method15(11);
        method15(12);
        System.out.println("---------------method16-----------------");
        method16();
    }

}
