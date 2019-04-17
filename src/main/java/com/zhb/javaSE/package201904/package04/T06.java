package com.zhb.javaSE.package201904.package04;

import java.util.Scanner;

/*
* 定义一个字符，判断是否为字母。*/
public class T06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符：");
        char b = sc.next().charAt(0);//scanner 输入char类型
        isChar(b);
    }
    public static boolean isChar(char a){
        char c = '1';
        if ((a>='A' && a<='Z') || (a>='a' && a<='z')){
            System.out.println(a+"是字母");
            return true;
        }else {
            System.out.println("不是");
            return false;
        }
    }
}
