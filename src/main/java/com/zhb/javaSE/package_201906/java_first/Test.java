package com.zhb.javaSE.package_201906.java_first;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-06-05 20:00
 **/
public class Test {
    public static void main(String[] args) {
        //method();
        int[] scores = {89 , -23 , 64 , 91 , 119 , 52 , 73};
        Arrays.sort(scores);
        method1(scores);
    }
    //定义方法完成成绩排序并输出前三名的功能

    public static void method1(int[] scores){
        int c = 0;
        System.out.println("考试成绩前三名为：");
        for ( int i = scores.length - 1; i >= 0; i-- ) {
            if(scores[i]>0 ||scores[i]<100 ){
                c++;
                if (c >3){
                    break;
                }
                System.out.println(scores[i]);
                continue;
            }
        }
    }
    /*
     * 功能：创建指定长度的int型数组，并生成100以内随机数为数组中的每个元素赋值
     * 定义一个带参带返回值的方法，通过参数传入数组的长度，返回赋值后的数组
     */
    public int[] getArray(int length) {
        // 定义指定长度的整型数组
        int[] nums = new int[length];

        // 循环遍历数组赋值
        for (int i = 0; i < nums.length; i++) {
            // 产生一个100以内的随机数，并赋值给数组的每个成员
            nums[i] = (int) (Math.random() * 100);


        }
        return nums; // 返回赋值后的数组
    }

    public static void method() {
        int classNum = 3;
        int stuNum = 4;
        int sum = 0;
        double avg = 0;
        double sroce = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < classNum; i++) {
            for (int j = 0; j < stuNum; j++) {
                System.out.println("请输入第" + (j + 1) + "个学生成绩：");
                sroce = input.nextInt();
                sum += sroce;
            }
            avg = sum / stuNum;
            sum = 0;
            System.out.println("第" + (i + 1) + "个班级学生成绩平均分为：" + avg);
        }
    }
}
