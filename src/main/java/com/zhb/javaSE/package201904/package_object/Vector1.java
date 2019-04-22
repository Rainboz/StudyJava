package com.zhb.javaSE.package201904.package_object;

import java.util.Scanner;
import java.util.Vector;

/**
 * @program: StudyJava
 * @description: Vector
 * @author: rainboz
 * @create: 19-4-22 下午4:10
 **/
public class Vector1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner;
        Vector v = new Vector();
        int count;
        //  Integer obj =Integer.parseInt((String) count);
//        Integer obj=count;
        while (true) {
            try {
                System.out.println("输入学生成绩：");
                scanner = new Scanner(System.in);
                int score = scanner.nextInt();
                // v.addElement(new Integer(score));//自动类型转换
                v.addElement(score);
                if (score < 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println(" 输入错误，请重新输入！！");
            }

        }
        Object obj = v.elementAt(0);
        int maxValue = (Integer) obj;
        for (int i = 0; i < v.size() - 1; i++) {
            if (maxValue < (Integer) v.elementAt(i)) {
                maxValue = (Integer) v.elementAt(i);
            }
        }
        for (int i = 0; i < v.size() - 1; i++) {
            if (maxValue - (Integer) v.elementAt(i) <= 10) {
                System.out.println("student[" + i + "]" + " score is " + (Integer) v.elementAt(i) + " ,level is ->A等！");
            } else if (maxValue - (Integer) v.elementAt(i) <= 20) {
                System.out.println("student[" + i + "]" + " score is " + (Integer) v.elementAt(i) + " ,level is ->B等！");
            } else if (maxValue - (Integer) v.elementAt(i) <= 30) {
                System.out.println("student[" + i + "]" + " score is " + (Integer) v.elementAt(i) + " ,level is ->C等！");
            } else
                System.out.println("student[" + i + "]" + " score is " + (Integer) v.elementAt(i) + " ,level is- >D等！");
        }
    }
}

