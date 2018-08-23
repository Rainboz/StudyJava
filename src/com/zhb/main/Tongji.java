package com.zhb.main;

import java.util.Scanner;

/**
 * @author Rainboz E-mail:784269332@qq.com
 * @version 创建时间：2018年8月17日 上午9:56:24
 * 类说明:计算数字k在0到n中的出现的次数，k可能是0~9的一个值
 * 例如n=12，k=1，在 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]，我们发现1出现了5次 (1, 10, 11, 12)
 */
public class Tongji {
	public static void main(String[] args) {
	    Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入k: ");
        int sk = scanner.nextInt();
        System.out.println("请输入n: ");
        long sn = scanner.nextLong();
        if (0 <= sk && sk <= 9){
            solution.digitCounts(sk,sn);
        }else {
            System.out.println("k必须在[0-9]范围内！");
        }
    }
	public static class Solution {
        /**
	     * @param k : An integer
	     * @param n : An integer
	     * @return: An integer denote the count of digit k in 1..n
	     */
        protected int digitCounts(int k, long n) {
	        // write your code here
//            int [] arr = new int[n];
//            for (int i = 0; i <n ; i++) {
//                arr[i] = i;
//
//            }
//            for (int j = 0; j < arr.length; j++) {
//
//                if (k == arr[j]){
//                    count++;
//                }
//            }
            int count = 0;
            long startTime=System.currentTimeMillis();   //获取开始时间
            char kk = (char)('0' + k);
            for (int i = 0; i <= n; i++) {
                String nn = Integer.toString(i);
                for (int j = 0; j < nn.length(); j++) {
                    if (nn.charAt(j) == kk) count++;
                }
            }
            System.out.println("k在n中出现："+count+"次");
            long endTime=System.currentTimeMillis();
            System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
            return count;
	    }
	}
	

}
