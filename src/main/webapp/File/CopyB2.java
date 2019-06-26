package com.zhb.LintCode.sushu;

import java.util.Arrays;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-29 19:10
 **/
public class Su1 {
    public static int aplusb(int a, int b) {
        // write your code here
        int sum_without_carry, carry;

        sum_without_carry = a ^ b; //没有进位的和
        //如果a、b两个值不相同，则异或结果为1。如果a、b两个值相同，异或结果为0。
        System.out.println("sum_without_carry:"+sum_without_carry);
        carry = (a & b) << 1;
        System.out.println("(a & b)"+(a & b)+" 0<<1 "+(0<<1));
        System.out.println("左移一位："+carry);
        if (carry == 0)
            return sum_without_carry;
        else
            return aplusb(sum_without_carry, carry);
    }

    public static void main(String[] args) {
        int s = aplusb(50,2);
        System.out.println(s);
    }
}
