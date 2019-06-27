package com.zhb.javaSE.test_20190517;

import java.io.*;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-17 下午1:10
 **/
public class T3 {
    public static void main(String[] args) throws IOException {
        //定义一个文件，读
        //分隔符转换Windows,linux都能识别的兼容路径
        File f = null;
        String split = f.separator;
        BufferedReader br = new BufferedReader(new FileReader(split+"home"+split+"rainboz"+split+"linux"+split+"file"+split+"info.txt"));

        String line;
        char[] chs = new char[1024];
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}

