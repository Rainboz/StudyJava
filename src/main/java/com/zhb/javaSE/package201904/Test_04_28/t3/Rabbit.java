package com.zhb.javaSE.package201904.Test_04_28.t3;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-06 00:15
 **/
public class Rabbit {
    public static void main(String[] args) {
        //i从第一个月开始：i=1,i=0时报错：Exception in thread "main" java.lang.StackOverflowError
        for (int i = 1; i < 13; i++) {
            //每月的兔子总数
            int result = f(i);
            System.out.println("第 " + i + " 月的兔子总数: " + result);
        }
    }

    /**
     * f(1) = 1
     * f(2) = 1
     * f(3) = 2 f(3)=f(1)+f(2)
     * f(4) = 3 f(4)=f(3)+f(2)
     * f(5) = 5 f(5)=f(4)+f(3)
     * f(6) = 8  ...
     * f(7) = 13 ...
     * f(8) = 21 ...
     */
    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
