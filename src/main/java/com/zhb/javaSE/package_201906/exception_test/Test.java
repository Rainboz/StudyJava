package com.zhb.javaSE.package_201906.exception_test;

import com.zhb.javaSE.package_201906.exception_test.MyException;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-06-16 12:51
 **/
public class Test {
    public static void main(String[] args) throws MyException {
        int i = method();
        System.out.println("i: "+i);
    }

    public static int method() throws MyException {
        int a = 10;
        int result = 100;
        try {
            while (result > -1) {
                a--;
                result += result / a;
            }
            return result;
        } catch (Exception e) {
//            e.printStackTrace();
            String str = e.toString();
            throw new MyException(str);
            //System.out.println("异常！");
           // return -1;
        }
    }
}
