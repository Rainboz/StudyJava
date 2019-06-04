package com.zhb.javaSE.stream_file_io.win10;

import java.io.*;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-15 10:05
 **/
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Rainboz\\Desktop\\random_list_name.txt");
        FileReader fileReader = null;
        BufferedReader reader = null;
        InputStreamReader inputStreamReader = null;
        InputStream inputStream = null;
        try {
            fileReader = new FileReader(file);
            inputStream = new FileInputStream(file);
            //为什么是GBK,不是UTF8
            inputStreamReader = new InputStreamReader(inputStream, "GBK");

            reader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(fileReader.read());
            System.out.println(fileReader.getEncoding());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                reader.close();
                inputStream.close();
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
