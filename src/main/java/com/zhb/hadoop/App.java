package com.zhb.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class App {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        FileSystem fileSystem = getFileSystem();

        //read hdfs file
        String fileName = "/user/rain/wc.input";
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

    public static FileSystem getFileSystem() throws IOException, URISyntaxException, InterruptedException {
        Configuration configuration = new Configuration();
        System.setProperty("hadoop.home.dir","E:\\tools\\hadoop-2.7.2");
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop-zhb004.com:9000"), configuration, "rain");
        return fs;
    }
}
