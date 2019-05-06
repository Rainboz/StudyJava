package com.zhb.javaSE.package201904.package_Exception;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-29 14:29
 **/
public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void method() throws MyException {
        throw new MyException("分母不能为0");
    }
}
