package com.zhb.javaSE.stream_file_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("jdbc.properties");
        System.out.println(file.createNewFile());
        FileInputStream f = new FileInputStream(file);
        System.out.println(f.read());

        f.close();
    }
}
