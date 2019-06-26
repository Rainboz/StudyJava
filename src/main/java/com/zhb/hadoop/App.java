package com.zhb.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = getFileSystem();

        //read hdfs file
        String fileName = "/user/zhb/wc.txt";
        Path path = new Path(fileName);
        FSDataInputStream inputStream = fileSystem.open(path);
        try {
            //hdfs data out console
            IOUtils.copyBytes(inputStream,System.out,4096,false);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //close
            IOUtils.closeStream(inputStream);
        }

    }

    public static FileSystem getFileSystem() throws IOException {
        Configuration configuration = new Configuration();
        FileSystem fileSystem = FileSystem.get(configuration);
        return fileSystem;
    }
}
