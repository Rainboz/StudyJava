package com.zhb.javaSE.package_201906.exception_test;

import java.util.Date;
import java.util.Scanner;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-06-16 13:29
 **/
public class BookTest {
    public static void main(String[] args) throws MyException {

            method();

    }

    public static void method() throws MyException {
        //1.定义字符串数组保存图书信息
        Books[] books = new Books[3];
        Date date = new Date();
        long time = date.getTime();
        //System.out.println(date.getTime());
        books[0] = new Books(1, "时间简史", "科学", time, time);
        books[1] = new Books(2, "java编程思想", "学习", time, time);
        books[2] = new Books(3, "小王子", "奇幻", time, time);
//        2.提示用户输入，分别按“书名”和“图书序号”查找图书
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入查询类型：");
        System.out.println("1.按“书名”查询图书");
        System.out.println("2.按“图书序号”查询图书");
        //查询类型
        int f_type = sc.nextInt();
//      BUG1：条件语句有问题，不能再输入查询类型前提示用户输入
//      BUG2：并提示重新输入,未实现
        //判断用户输入数据类型
        if (f_type == 2 && sc.hasNextInt()) {
            //提示用户进入根据图书序号查询类型
            //System.out.println("进入根据图书序号查询类型,请输入图书序号：");
            //int 按图书序号查找图书
            int input_id = sc.nextInt();
            //如果输入图书序号不存在与数组中为false
            boolean flag = false;
            //遍历图书存储数组
            for (int i = 0; i < books.length; i++) {
                //如果用户输入 图书序号 与数组中 book_id相等，找到图书并输出信息
                if (input_id == books[i].getBook_id()) {
                    flag = true;
                    System.out.println(books[i]);
                }
            }
            if (!flag) {
                //图书序号超出字符串数组范围false
//                System.out.println("图书序号超出字符串数组范围!");
                //重新输入

                throw new MyException("图书序号超出字符串数组范围!");
            }
        } else if (f_type == 1 && sc.hasNext()) {
            //提示用户进入根据书名查询类型
            //System.out.println("进入根据书名查询类型,请输入书名：");
            //String 按书名查找图书
            String input_name = sc.next();
            //如果书名不存在false
            boolean flag = false;
            //遍历图书存储数组
            for (int i = 0; i < books.length; i++) {
                //如果用户输入 书名 与数组中 bool_name相等，找到图书并输出信息
                if (input_name.equals(books[i].getBool_name())) {
                    flag = true;
                    System.out.println(books[i]);
                }
            }
            if (!flag) {
                //书名不存在false
                //重新输入

                throw new MyException("图书不存在异常");

            }
        } else {
            //重新输入

            //错误命令异常
            throw new MyException("错误命令异常");

        }
    }

}
