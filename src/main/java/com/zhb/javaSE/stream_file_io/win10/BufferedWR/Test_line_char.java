package com.zhb.javaSE.stream_file_io.win10.BufferedWR;

import java.io.*;

/**
 * @program: StudyJava
 * @description: 测试缓冲流的一行读readLine()和字符数组读的效率read(chars)
 * @author: rainboz
 * @create: 2019-05-16 20:01
 **/
public class Test_line_char {
    public static void main(String[] args) throws IOException {
        Long start = System.currentTimeMillis();
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\main\\webapp\\File\\test.txt",true));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("src\\main\\webapp\\File\\test_write.txt"));

        BufferedReader br = new BufferedReader(new FileReader("src\\main\\webapp\\File\\test.txt"));
        StringBuilder sb = new StringBuilder("zhb");
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            bw.write(sb.toString());
        }
        String line;
        while ((line = br.readLine()) != null) {
            bw2.write(line);
            bw2.newLine();
            bw2.flush();
        }

        //释放资源
        br.close();
        bw.close();
        bw2.close();
        Long stop = System.currentTimeMillis();
        System.out.println("程序运行时间："+(stop-start));
    }
}
