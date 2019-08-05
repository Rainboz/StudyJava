package com.zhb.javaSE.stream_file_io;

import java.io.File;

public class RenameFile {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //获取指定路径目录
        File file = new File("C:\\Users\\Rainboz\\Desktop\\test");
        String d = System.getProperty("param");//获取当前文件路径；
        System.out.println(d);
        //输出文件名
        //System.out.println(file.getName());
        //把文件重命名为指定的文件路径
        //System.out.println(file.renameTo(new File("test/2019.08.05_test01")));
        renameFile2(d);

    }

    public static void renameFile(File file) {
        /**
         *   方法:
         *   public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
         *   public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组
         *   重载方法:
         *   public String[] list(FilenameFilter filter)
         *   public File[] listFiles(FileFilter filter)
         **/
        //1. 获取test目录下所有文件或目录名称的String[]数组
        String[] fileNameList = file.list();
        //System.out.println(fileNameList.length);
        //2. 循环
        for (int i = 0; i < fileNameList.length; i++) {
            //System.out.println(fileNameList[i]);
            //替换前:
            File f1 = new File(file + "/" + fileNameList[i]);
            System.out.println("替换前: " + fileNameList[i]);
            for (int j = 0; j < fileNameList[i].length(); j++) {
                if ((fileNameList[i].charAt(j)) == '.') {
                    //返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
                    fileNameList[i] = fileNameList[i].replace('.', '_');
                }
            }
            //替换后的字符串
            System.out.println("替换后: " + fileNameList[i]);
            File f2 = new File(file + "/" + fileNameList[i]);
            //重命名
            if (f1.renameTo(f2)) {
                System.out.println("重命名成功！");
            } else {
                System.out.println("重命名失败！");
            }
            //System.out.println(fileNameList[i]);

        }

       /* String[] str = {"2018.08.06_test01", "2018.08.06_test02", "2018.08.06_test03"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i].replace('.', '_'));
        }
        String str1 = "2018.08.06_test01";
        System.out.println(str1.replace('.', '_'));*/
    }

    public static void renameFile2(String d) {
        //1. 获取test目录下所有文件或目录名称的String[]数组
        File file = new File(d);
        String[] fileNameList = file.list();

        //2. 循环
        for (int i = 0; i < fileNameList.length; i++) {
            //System.out.println(fileNameList[i]);
            //替换前:
            File f1 = new File(file + "/" + fileNameList[i]);
            System.out.println("替换前: " + fileNameList[i]);
            for (int j = 0; j < fileNameList[i].length(); j++) {
                if ((fileNameList[i].charAt(j)) == '.') {
                    //返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
                    fileNameList[i] = fileNameList[i].replace('.', '_');
                }
            }
            //替换后的字符串
            System.out.println("替换后: " + fileNameList[i]);
            File f2 = new File(file + "/" + fileNameList[i]);
            //重命名
            if (f1.renameTo(f2)) {
                System.out.println("重命名成功！");
            } else {
                System.out.println("重命名失败！");
            }
        }

    }
}