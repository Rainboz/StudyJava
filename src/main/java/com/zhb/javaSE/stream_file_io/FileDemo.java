package com.zhb.javaSE.stream_file_io;

import java.io.*;

/**
 * File(File parent, String child)
 * 从父抽象路径名和子路径名字符串创建新的 File实例。
 *
 * File(String pathname)
 * 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
 *
 * File(String parent, String child)
 * 从父路径名字符串和子路径名字符串创建新的 File实例。
 *
 * File(URI uri)
 * 通过将给定的 file: URI转换为抽象路径名来创建新的 File实例。
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File file = new File("H:\\study\\java\\workspace\\1.txt");
//        File file = new File("H:\\study\\java\\workspace\\a\\1.txt");
        File file2 = new File("H:\\study\\java\\workspace\\a","1.txt");
        File file3 = new File(file2,"1.txt");
        file2.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(file2);
        fileInputStream.read();
        fileInputStream.close();
        FileWriter f = new FileWriter(file2);
        f.write("Java是一种可以撰写跨平台应用软件的面向对象的程序设计语言，是由Sun Microsystems公司于\n" +
                "1995年5月推出的Java程序设计语言和Java平台（即JavaSE, JavaEE, JavaME）的总称。Java 技术具有\n" +
                "卓越的通用性、高效性、平台移植性和安全性，广泛应用于个人PC、数据中心、游戏控制台、科学超级\n" +
                "计算机、移动电话和互联网，同时拥有全球最大的开发者专业社群。在全球云计算和移动互联网的产业\n" +
                "环境下，Java更具备了显著优势和广阔前景。");
        f.close();
    }
}
