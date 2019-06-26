package com.zhb.javaSE.stream_file_io.win10;

import java.io.FileReader;
import java.io.IOException;

/**
 * @program: StudyJava
 * @description: FileReader读取数据方式一：一次读取一个字符int read();
 * @author: rainboz
 * @create: 2019-05-16 09:49
 **/
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 读数据---输入流---FileReader
         *          FileReader(String fileName):传递文件名
         * 输入流读文件步骤：
         *          A：创建输入流对象
         *          B：调用输入流对象的读数据方法
         *          C：释放资源
         */
//        FileReader fr = new FileReader("package.json");
        FileReader fr = new FileReader("pom.xml");
        int a = fr.read();
        System.out.print((char) a);
        //如果读取数据返回值为-1，说明没有数据了
        int ch;
        while ((ch = fr.read())!=-1){
            System.out.print((char) ch);
        }
        //释放资源
        fr.close();
    }
}
