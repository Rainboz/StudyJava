package com.zhb.javaSE.stream_file_io.win10.BufferedWR;

import java.io.*;

/**
 * @program: StudyJava
 * @description: BufferedWriter:void newLine() 写一行行分隔符。
 * BufferedReader:String readLine() 读一行文字。
 * @author: rainboz
 * @create: 2019-05-16 19:35
 **/
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        /*BufferedWriter bw  =  new BufferedWriter(new FileWriter("src\\main\\webapp\\file\\bw2.txt"));
        for (int i = 0; i <10 ; i++) {
            bw.write("hello"+i);
//            bw.write("\r\n");
            bw.newLine();//换行
            bw.flush();
        }
        bw.close();*/
        BufferedReader br = new BufferedReader(new FileReader("src\\\\main\\\\webapp\\\\file\\\\br.txt"));
      /*  String line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);*/
        String line;
        while ((line = br.readLine()) != null) {
//            System.out.print(line);//读是不读换行符的要用println
            System.out.println(line);
        }
        //释放资源
        br.close();
    }
}
