package com.zhb.javaSE.package_201906.exception_test;

import java.util.Date;

/**
 * @program: StudyJava
 * @description:模拟借书系统
 * 1.定义字符串数组保存图书信息
 * 2.提示用户输入，分别按“书名”和“图书序号”查找图书
 * 3.异常处理：
 *      a.如果输入类型错误，抛出“错误命令异常”，并提示重新输入
 *      b.如果书名不存在，抛出“图书不存在异常”，并提示重新输入
 *      c.如果图书序号超出字符串数组范围，抛出“图书不存在异常”，并提示重新输入
 * @author: rainboz
 * @create: 2019-06-16 13:23
 **/
public class Books {
    private int book_id;
    private String bool_name;
    private String book_type;
    private long borrow_time;
    private long back_time;

    public Books() {
    }

    public Books(int book_id, String bool_name, String book_type, long borrow_time, long back_time) {
        this.book_id = book_id;
        this.bool_name = bool_name;
        this.book_type = book_type;
        this.borrow_time = borrow_time;
        this.back_time = back_time;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBool_name() {
        return bool_name;
    }

    public void setBool_name(String bool_name) {
        this.bool_name = bool_name;
    }

    public String getBook_type() {
        return book_type;
    }

    public void setBook_type(String book_type) {
        this.book_type = book_type;
    }

    public long getBorrow_time() {
        return borrow_time;
    }

    public void setBorrow_time(long borrow_time) {
        this.borrow_time = borrow_time;
    }

    public long getBack_time() {
        return back_time;
    }

    public void setBack_time(long back_time) {
        this.back_time = back_time;
    }

    @Override
    public String toString() {
        return "Books{" +
                "book_id=" + book_id +
                ", bool_name='" + bool_name + '\'' +
                ", book_type='" + book_type + '\'' +
                ", borrow_time=" + borrow_time +
                ", back_time=" + back_time +
                '}';
    }
}
