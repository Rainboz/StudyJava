package com.zhb.javaSE.stream_file_io.ubuntu;

import java.io.*;
import java.util.ArrayList;

/**
 * @program: StudyJava
 * @description: 将ArrayList中的元素数据存储到文件
 * @author: rainboz
 * @create: 19-5-17 上午9:33
 **/
public class ArrayLIstToFileTest {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
        //分隔符转换Windows,linux都能识别的兼容路径
        File f = null;
        String split = f.separator;
        //创建缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter(split+"home"+split+"rainboz"+split+"linux"+split+"file"+split+"array1.txt",true));

        BufferedReader br = new BufferedReader(new FileReader(split+"home"+split+"rainboz"+split+"linux"+split+"file"+split+"array1.txt"));
        //遍历
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        //释放资源
        bw.close();
        br.close();

    }
}

