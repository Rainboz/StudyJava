package com.zhb.hadoop;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;

import java.io.*;

import java.net.URI;
import java.net.URISyntaxException;


/**
 * @author rainboz
 * @progrom StudyJava
 * @description TODO
 * @date 19-7-1 下午8:20
 */
public class HDFSIO {
    /*
     * @Description: //TODO 需求：把本地/home/rainboz/Desktop/dept.txt文件上传到HDFS根目录
     * @Date 下午8:32 19-7-1
     * @Param []
     * @return void
     */
    @Test
    public void putFileToHDFS() throws IOException, URISyntaxException, InterruptedException {

        // 1 获取对象
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://rain-one:9000"), conf, "rain");

        // 2 获取输入流对象
        FileInputStream fis = new FileInputStream(new File("/home/rainboz/Desktop/dept.txt"));

        // 3 获取输出流对象
        FSDataOutputStream fos = fs.create(new Path("/bangzhang.txt"));

        // 4 流的对拷
        IOUtils.copyBytes(fis, fos, conf);

        // 5 关闭资源
        IOUtils.closeStream(fos);
        IOUtils.closeStream(fis);
        fs.close();
    }

    /*
     * @Description: //TODO 需求：从HDFS上下载/0701/rainboz/emp.txt文件到本地/home/rainboz/Desktop
     * @Date 下午8:47 19-7-1
     * @Param []
     * @return void
     */
    @Test
    public void getFileFromHDFS() throws IOException, URISyntaxException, InterruptedException {
        // 1 获取文件系统
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://rain-one:9000"), conf, "rain");

        // 2 获取输入流
        FSDataInputStream fis = fs.open(new Path("/0701/rainboz/emp.txt"));

        // 3 获取输出流
        FileOutputStream fos = new FileOutputStream(new File("/home/rainboz/Desktop/emp_hdfs.txt"));

        // 4 流的对拷
        IOUtils.copyBytes(fis, fos, conf);

        // 5 关闭资源
        IOUtils.closeStream(fos);
        IOUtils.closeStream(fis);
        fs.close();
    }

    //需求：分块读取HDFS上的大文件，比如根目录下的/31_java锁之读写锁代码验证.avi
    /*
     * @Description: //TODO 下载第一块
     * @Date 下午8:59 19-7-1
     * @Param
     * @return
     */
    @Test
    public void readFileSeek1() throws IOException, URISyntaxException, InterruptedException {
        // 1 获取文件系统
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://rain-one:9000"), conf, "rain");

        // 2 获取输入流
        FSDataInputStream fis = fs.open(new Path("/31_java锁之读写锁代码验证.avi"));

        // 3 获取输出流
        FileOutputStream fos = new FileOutputStream(new File("/home/rainboz/Desktop/31_java锁之读写锁代码验证.avi.part1"));

        // 4 流的对拷(只拷贝128M)
        byte[] buf = new byte[1024];
        for (int i = 0; i < 1024 * 128; i++) {
            fis.read(buf);
            fos.write(buf);
        }
        // 5 关闭资源
        IOUtils.closeStream(fos);
        IOUtils.closeStream(fis);
        fs.close();

    }

    /*
     * @Description: //TODO 下载第二块
     * @Date 下午9:12 19-7-1
     * @Param []
     * @return void
     */
    @Test
    public void getFileSeek2() throws IOException, URISyntaxException, InterruptedException {
        // 1 获取文件系统
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://rain-one:9000"), conf, "rain");

        // 2 获取输入流
        FSDataInputStream fis = fs.open(new Path("/31_java锁之读写锁代码验证.avi"));

        // 3 指定位置开始读(重点)
        fis.seek(1024 * 1024 * 128);

        // 4 获取输出流
        FileOutputStream fos = new FileOutputStream(new File("/home/rainboz/Desktop/31_java锁之读写锁代码验证.avi.part2"));

        // 5 流的对拷
        IOUtils.copyBytes(fis, fos, conf);

        // 6 关闭资源
        IOUtils.closeStream(fos);
        IOUtils.closeStream(fis);
        fs.close();
    }
}
