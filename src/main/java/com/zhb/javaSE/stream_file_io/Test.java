package com.zhb.javaSE.stream_file_io;

import java.io.*;

/**
 * @program: StudyJava
 * @description: test
 * @author: rainboz
 * @create: 2019-04-21 13:58
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        //FileInputStream 和 FileOutputStream：
        //可以使用字符串类型的文件名来创建一个输入流对象来读取文件：
        InputStream f = new FileInputStream("/home/rainboz/linux/a.txt");

        //也可以使用一个文件对象来创建一个输入流对象来读取文件。我们首先得使用 File() 方法来创建一个文件对象：
        File file = new File("/home/rainboz/linux/a.txt");
        InputStream out = new FileInputStream(file);
        

    }
}
