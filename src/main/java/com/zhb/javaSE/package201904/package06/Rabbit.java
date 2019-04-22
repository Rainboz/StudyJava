package com.zhb.javaSE.package201904.package06;

/**
 * @program: StudyJava
 * @description: a
 * @author: rainboz
 * @create: 2019-04-18 20:07
 **/
public class Rabbit{

        public static void main(String[] args) {
            System.out.println("第1个月的兔子对数:    1");
            System.out.println("第2个月的兔子对数:    1");
            int f1 = 1, f2 = 1, f3, M = 24;
            for (int i = 3; i <= M; i++) {
                //1  1  2  3  5  8
                //f1 f2 f3
                //   f1  f2 f3
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;

                System.out.println("第" + i + "个月的兔子对数: " + f2);
            }
        }

}
