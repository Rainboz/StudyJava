package com.zhb.javaSE.stream_file_io.win10.BufferedWR;

import java.io.*;

/**
 * @program: StudyJava
 * @description: 需求：
 * 把一个路径下的文件A2的内容复制到其他路径下的文件CopyB2中
 * 数据源：
 * A3--读数据--FileReader--高效的读数据---BufferedReader
 * 目的地：
 * CopyB3--写数据--FileWriter---高效的写数据---BufferedWriter
 * @author: rainboz
 * @create: 2019-05-16 11:39
 **/
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //创建输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("src\\main\\webapp\\file\\A3.txt"));
        //创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\main\\webapp\\file\\CopyB3.txt"));

        //读取数据一个字符
        /*int ch1;
        while ((ch1 = br.read()) != -1) {
            //写数据
            bw.write(ch1);
        }*/

        //一次读取一个字符数组
        int len;
        char[] chars = new char[1024];
        while ((len = br.read(chars)) != -1) {
//            System.out.println(new String(chars, 0, len));
            bw.write(chars,0,len);
        }

        //释放资源
        br.close();
        bw.close();

    }
}
