package com.zhb.javaSE.stream_file_io.win10;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-15 15:45
 **/
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        //FileWriter fw = new FileWriter("src\\main\\resources\\zhb.properties");//getResourceAsStream，默认resources,不知道
        FileWriter fw = new FileWriter("src\\main\\webapp\\File\\zhb.txt");//项目根目录
        /*
         *创建输出流做了哪些事情：
         *          A：调用系统资源创建了一个文件
         *          B：创建输出流对象
         *          C：把输出流对象指向文件
         */
        //调用输出流对象的写数据的方法
        //写一个字符串数据
        fw.write("20190516");
        //字符写不进去，没有直接写到文件，其实是写到了内存缓冲区
        //刷新缓冲区
        fw.flush();

        //释放资源
        //通知系统释放和该文件相关的资源
        fw.close();
//        while (true){}
    }
}