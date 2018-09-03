package com.zhb.main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rainboz E-mail:784269332@qq.com
 * @version 创建时间：2018年8月16日 下午7:10:03 类说明TODO
 */
public class Solution {
	/*
	 * 尾数为零
	 */
	public static long trailingZeros(long n) {
		long count = 0;
		long temp = n / 5;
		while (temp != 0) {
			count = count + temp;
			temp = temp / 5;
		}
		System.out.println("count:" + count);
		return count;
	}

	// 计算阶乘
	public static long factorial(long number) {
		if (number <= 1)
			return 1;
		else
			return number * factorial(number - 1);
	}

	// 排序
	public static void sortIntegers(int[] A) {
		// write your code here
		for (int i = 0; i < A.length - 1; i++) {

			for (int j = 0; j < A.length - 1 - i; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j + 1];
					A[j + 1] = A[j];
					A[j] = temp;
				}

			}
		}
	}

	// 加一
	public static int[] plusOne(int[] digits) {

		return digits;
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long n = sc.nextLong();
		// trailingZeros(n);
		// System.out.println("N的阶乘:"+factorial(n));
		// int A[] = { 3, 2, 1, 4, 5 };
		// for (int num : A) {
		// System.out.print(num);
		// }
		// sortIntegers(A);
		// for (int num : A) {
		// System.out.print(num + " ");
		// }
		int[] a = { 3, 2, 1, 4, 5 };
		sortIntegers(a);
		
		/*
		 * 查看数组的定义
		 * 数组的3种输出方式
		 * */
		//1
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]+" ");
		}
		//2
		for(int i :a){
			System.out.print(i);
		}
		//3
		System.out.println(Arrays.toString(a));

		
	}

}
