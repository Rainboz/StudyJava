package com.zhb.javaSE.package_201906.string_test;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-06-16 15:18
 **/
public class Insert_string {
    public static void main(String[] args) {
        // 创建一个空的StringBuilder对象

        StringBuilder str = new StringBuilder();
        // 追加字符串
        str.append("jaewkjldfxmopzdm");

        // 从后往前每隔三位插入逗号
        for(int i = str.length()-3;i >=0 ;i-=3)
        {
            str.insert(i,",");
        }
        // 将StringBuilder对象转换为String对象并输出
        System.out.print(str.toString());
    }
}
