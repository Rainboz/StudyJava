package com.zhb.main;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		System.out.println(new Date());
		System.getProperties().list(System.out);//获取系统属性
		System.out.println(System.getProperty("user.name"));
		System.getProperty("java.library.path");
		System.out.printf("shshhsh\thhghg");
	}

}
