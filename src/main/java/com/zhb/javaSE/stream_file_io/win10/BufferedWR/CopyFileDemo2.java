package com.zhb.javaSE.stream_file_io.win10.BufferedWR;

import java.io.*;

/**
 * @program: StudyJava
 * @description: 一次读一行
 * @author: rainboz
 * @create: 2019-05-16 19:52
 **/
public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src\\main\\webapp\\File\\A4.txt"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\main\\webapp\\File\\CopyB4.txt"));

        //读数据
        String line;
        while ((line = br.readLine()) != null) {
//            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //
        br.close();
        bw.close();
    }
}
