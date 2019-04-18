package com.zhb.javaSE.package201904.package06;

import java.util.Scanner;

/**
 * @program: StudyJava
 * @description: 8.输入两个正整数m和n，求其最大公约数和最小公倍数
 * @author: rainboz
 * @create: 2019-04-17 11:45
 **/
public class Aa {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        int min=(a>b)?b:a;
        int max=(a>b)?a:b;
        for(int i=min;i>1;i--) {

            if(a%min==0&&b%min==0) {
                System.out.println("最大公约数是:"+min);
                break;
            }else {
                System.out.println("没有最大公约数");
                break;
            }
        }
        for(int i=max;i<=a*b;i++) {
            max = i;
            if(max%a==0&&max%b==0) {
                System.out.println("最小公倍数是："+i);
                break;
            }
        }
    }
}
