package com.zhb.javaSE.package201904.package05;

import sun.security.util.Length;

import java.util.Scanner;
//实验05_循环.doc

public class Test {
    /**
     * 2.本金10000元存入银行，年利率是千分之三，每过1年，将本金和利息相加作为新的本金。计算5年后，获得的本金是多少？(用double存储)
     */
    public static void method1(double money){
        double year_p = 0.003;
        for (int i = 1; i < 5; i++) {
            money += money*year_p;
        }
        System.out.println(String.format("%.2f",money));
    }
    /**
     * 3. 计算出1—100之间所有能被3整除的整数的和？
     */
    public static void method2(){
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    /**
     *4. 计算1000以内所有不能被7整除的整数之和？
     */
    public static void method3(){
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 7 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    /**
     *5.用while做 求10到20的累加和
     */
    public static void  method4(){
        int i = 10;
        int sum = 0;
        while (i <= 20){
            sum += i;
            i++;//10+11+12+13+14+15+16+17+18+19+20
        }
        System.out.println(sum);
        System.out.println(10+11+12+13+14+15+16+17+18+19+20);
    }
    /**
     * 6. 找出一个数的所有因子数
     * 因子数：除去本身外，能被这个数整除的数。1是容易忽略的因子数。
     * 短除法：开始时用观察等方法，写出因数，逐渐缩小被除数，直到为质数。
     */
    public static void  method5(int a){
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && i != a){
                System.out.println(i);
            }
        }
    }

    /**
     * 7. 输入一个数，判断这个数是否是素数；
     * @param a
     */
    public static void  method6(int a){
        if (a % 2 != 0 && a != 1){
            System.out.println(a+"是素数");
        }else {
            System.out.println(a+"bu是素数");
        }
    }

    /**
     * 8 定义一个正整数如：1205  统计它的各位数字中零的个数，并求各位数字中的最大者。
     * @param args
     */
    public static void  method7(int a){
        int count = 0;
        char max = '0';
        String str = String.valueOf(a);
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] =='0'){
                count++;
            }
            if (chars[i] >= max){
                max = chars[i];
            }
        }
        System.out.println("零的个数:"+count+" 最大值:"+max);
    }

    /**
     * 有1020个西瓜，第一天卖掉总数的一半后又多卖出两个，以后每天卖剩下的一半多两个，问几天以后能卖完
     * @param x：西瓜总数
     */
    public static void  method8(int x){
        int day = 0;
        for (;x!=0;){
            x = x/2-2;
            day++;
        }
        System.out.println(day+"天以后能卖完");
//        if (x != 0){
//            x = x/2-2;//x=x/2-2  (a/2-2)/2-2
//            day++;
//        }else {
//            System.out.println(day+"天以后能卖完");
//        }
    }

    /**
     * 10猴子吃桃问题： 猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个，
     * 第二天早上又将剩下的桃子吃了一半，又多吃一个，以后每天都吃了前一天剩下的一半零一个。
     * 到第10天早上想再吃时，见只剩下一个桃子。求第一天共摘了多少个？
     * 1.a = first/2-1 第一天剩下的数量
     * 2.a/2-1
     * ....
     * 10.1
     *
     * 1
     * (1+1)*2
     * (((1+1)*2)+1)*2
     * ...
     *1.3070
     */
    public static void method9(){
        int a = 1;
        int count = 10;
        int[] b = new int[11];
        //int first = (a+1)*2;
        System.out.println("第"+count+"天剩下的数量："+a);
        for (int i = 0;i < 11;i++) {
            b[i] = a;
            a = (a+1)*2;
            count--;
            if (count >= 0)
            System.out.println("第"+count+"天剩下的数量："+a);
//            System.out.println("第一天共摘总-第一天剩下的（3070-1534）："+(3070-1534));
        }
        System.out.println("b[10]:"+b[10]);
        System.out.println("b[9]:"+b[9]);
        System.out.println("第一天共摘总-第一天剩下的（3070-1534）："+(b[10]-b[9]));
    }

    /**
     * 11判断一个数是否是完全数（完数指的是一个数的所有因子数的和等于这个数本身，
     * 例如 6=1+2+3,即6就是完全数）
     * @param a:整数
     */
    public static boolean method10(int a){
        int sum = 0;
        boolean flag = false;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && i != a){
                System.out.println("因子数:"+i);
                sum += i;
            }
        }
        System.out.println("原数："+a);
        if (sum == a){
            flag = true;
            return flag;
        }
        else {
            flag = false;
            return flag;
        }
    }

    /**
     * 12.循环录入某学生5门课的成绩并计算平均分，如果某分数录入为负，停止录入并提示录入错误（使用break）
     */
    public static double method11(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入5门课的成绩:");
        for (int i = 0; i < 5; i++) {
            int cj = sc.nextInt();
            if (cj < 0){
                System.out.println("成绩不能小于零");
                break;
            }else {
                System.out.println("第"+(i+1)+"门成绩为："+cj);
                sum += cj;
            }
        }
        System.out.println("平均分："+sum/5.0);
        return sum/5.0;
    }

    /**
     * 13.循环录入Java课的学生成绩，统计分数大于等于 80分的学生比例(使用continue)
     */
    public static void method12(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("输入N个成绩：");
        double n = sc.nextInt();
        int num1 = 0;
        double percent = 0.0;
        a:for (int i = 0; i < n; i++) {
            System.out.println("输入第"+(i+1)+"个成绩：");
            int sroce = sc1.nextInt();
            if (sroce >= 80){
                num1++;
                //continue a;
            }
        }
        System.out.println("80分以上的人数为："+num1);
        percent = (num1/n)*100.0;
//        System.out.println(num1/n);
        System.out.println("80分以上的人数所占比例："+percent+"%");
    }
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        method1(10000);
        System.out.println("--------------------------------");
        method2();
        System.out.println("--------------------------------");
        method3();
        System.out.println("--------------------------------");
        method4();
        System.out.println("--------------------------------");
        method5(200);
        System.out.println("--------------------------------");
        method6(1);
        System.out.println("--------------------------------");
        method7(454057900);
        System.out.println("--------------------------------");
        method8(1020);
        System.out.println("--------------------------------");
        method9();
        System.out.println("--------------------------------");
        System.out.println(method10(8));
        System.out.println("--------------------------------");
        method11();
        System.out.println("--------------------------------");
        method12();
        System.out.println("--------------------------------");
    }
}
