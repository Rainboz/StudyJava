package com.zhb.javaSE.stream_file_io.win10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: StudyJava
 * @description: FileReader读取数据方式一：一次读取一个字符数组int read(char[] cbuf);
 * @author: rainboz
 * @create: 2019-05-16 10:39
 **/
public class FileReaaderDemo2 {
    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("src\\main\\webapp\\File\\fr2.txt");
        FileReader fr = new FileReader("src\\main\\webapp\\File\\A.java");
        /*char[] ch = new char[5];
        //第一次读数据
        int len = fr.read(ch);
        System.out.println(len);
        System.out.println(new String(ch));

        //第二次读数据
        len = fr.read(ch);
        System.out.println(len);
        System.out.println(new String(ch));

        //第三次读数据
        len = fr.read(ch);
        System.out.println(len);
        System.out.println(new String(ch));*/

        char[] chars = new char[1024];
        int len;
        while ((len = fr.read(chars)) != -1){
            System.out.println(new String(chars));
        }
        //while (true){}
        //释放资源
        fr.close();
    }
}
