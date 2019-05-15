package com.zhb.mysql.package_201905.jdbc_test;

import java.lang.reflect.Field;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-14 11:35
 **/
public class TestClass {
    //利用反射机制给类属性赋值
    public static void main(String[] args) {
        try {
            Student s = new Student();
            Class aClass = s.getClass();
//        Field[] fields = aClass.getFields();//必须是public属性才能获取
//        System.out.println(fields.length);
            Field field = aClass.getDeclaredField("studentName");
            field.setAccessible(true);
            field.set(s, "zhb");
            System.out.println(s);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
