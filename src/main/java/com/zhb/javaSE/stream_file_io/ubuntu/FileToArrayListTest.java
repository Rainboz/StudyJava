package com.zhb.javaSE.stream_file_io.ubuntu;

import java.io.*;
import java.util.ArrayList;

/**
 * @program: StudyJava
 * @description: 读取文件数据存入集合中
 * @author: rainboz
 * @create: 19-5-17 上午10:04
 **/
public class FileToArrayListTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/rainboz/linux/file/array.txt"));

        ArrayList<String> array = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null){
            array.add(line);
        }

        //释放资源
        br.close();

        //遍历集合
        int i = 0;
        for (String x : array){
            System.out.println("第"+i+"个元素"+x.trim());
            i++;
        }
    }
}

