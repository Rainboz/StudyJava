package com.zhb.javaSE.package_201906.exception_test;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-06-16 12:54
 **/
public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
