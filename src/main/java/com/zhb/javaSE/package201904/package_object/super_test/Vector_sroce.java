package com.zhb.javaSE.package201904.package_object.super_test;

import java.util.Scanner;
import java.util.Vector;

/**
 * @program: StudyJava
 * @description: 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 * @author: rainboz
 * @create: 19-4-22 下午4:50
 **/
public class Vector_sroce {
    public static void main(String[] args) {
        Scanner sc;
        Vector v = new Vector();

        while (true){
            System.out.println("输入学生成绩：");
            sc = new Scanner(System.in);
            int sroce = sc.nextInt();
            v.addElement(sroce);
            if (sroce < 0){
                break;
            }
        }
        Object obj = v.elementAt(0);
        int max = (int) obj;
        for (int i = 0; i < v.size()-1; i++) {
            if (max < (int)v.elementAt(i)){
                max = (int)v.elementAt(i);
            }

        }
        for (int i = 0; i < v.size()-1; i++) {
            if (max - (int)v.elementAt(i) <= 10){
                System.out.println("Student["+i+"]"+" sorce is "+(int)v.elementAt(i)+" ,level is A");
            }
            else if (max - (int)v.elementAt(i) <= 20){
                System.out.println("Student["+i+"]"+" sorce is "+(int)v.elementAt(i)+" ,level is B");
            }
            else if (max - (int)v.elementAt(i) >= 30){
                System.out.println("Student["+i+"]"+" sorce is "+(int)v.elementAt(i)+" ,level is C");
            }else {
                System.out.println("Student["+i+"]"+" sorce is "+(int)v.elementAt(i)+" ,level is D");
            }
        }
        System.out.println(obj);
    }
}

