package com.zhb.javaSE.stream_file_io.win10;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-16 09:13
 **/
public class FileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileWriter fw = new FileWriter("src\\main\\webapp\\File\\zhb.txt");

        //fw.write("abcd");
        //fw.write("abcde",1,3);
//        fw.write('a');
//        fw.write(97);
        char[] chs = {'a','1','c','d','e'};
//        fw.write(chs,0,5);
        fw.write(chs,2,3);
        //释放资源
        fw.close();
    }
}
