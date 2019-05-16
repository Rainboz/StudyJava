package com.zhb.javaSE.stream_file_io.win10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: StudyJava
 * @description:
 * 需求：
 *     把一个路径下的文件A2的内容复制到其他路径下的文件CopyB2中
 * 数据源：
 *     A2--读数据--FileReader
 * 目的地：
 *     CopyB2--写数据--FileWriter
 * @author: rainboz
 * @create: 2019-05-16 11:04
 **/
public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileReader fr = new FileReader("src\\main\\webapp\\File\\A2.java");
        //创建输出流对象
        FileWriter fw = new FileWriter("src\\main\\webapp\\File\\CopyB2.java");

        //读数据，每次一个字符，用循环，-1为循环结束标志
        char[] chars = new char[1024];//1024进位
        int len;
        while ((len = fr.read(chars)) != -1) {
            //写入读取到的数据---->目标文件中
            fw.write(chars,0,len);
        }

        //释放资源,输入流,输出流关闭顺序不影响
        fr.close();
        fw.close();
    }
}
