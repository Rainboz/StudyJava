package com.zhb.javaSE.stream_file_io.win10.BufferedWR;

import java.io.*;

/**
 * @program: StudyJava
 * @description:
 * BufferedWriter:将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入。
 * BufferedReader:从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取。
 * @author: rainboz
 * @create: 2019-05-16 11:14
 **/
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建缓冲流对象
       /* BufferedWriter bw = new BufferedWriter(new FileWriter("src\\main\\webapp\\file\\bw.txt"));
        bw.write("hello1");
        bw.flush();
        bw.close();*/
        BufferedReader br = new BufferedReader(new FileReader("src\\main\\webapp\\file\\bw.txt"));
        //一次读取一个字符
       /* long start2 = System.currentTimeMillis();

        int ch;
        while ((ch = br.read()) != -1) {
            System.out.print((char)ch);//不能用println
        }
        long stop2 = System.currentTimeMillis();*/
        //一次读取一个字符数组
        long start2 = System.currentTimeMillis();
        int len;
        char[] chars = new char[1024];
        while ((len = br.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
        long stop2 = System.currentTimeMillis();
        System.out.println("代码块运行时间："+(-(start2-stop2)));
        //释放资源
        br.close();
    }
}
