package com.zhb.javaSE.stream_file_io.win10;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: StudyJava
 * @description:
 * 如何实现数据的换行？\n可以实现换行，但是Windows系统自带的记事本换行识别为\r\n
 * Windows:\r\n
 * linux:\n
 * mac:\r
 * 如何实现数据的追加写入？FileWriter("fileName",append):默认为false,true表示追加写入
 * @author: rainboz
 * @create: 2019-05-16 09:26
 **/
public class FileWriterDemo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src\\main\\webapp\\File\\zhb.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("helloworld"+i+"\r\n");
        }
        //释放资源
        fw.close();
    }
}
