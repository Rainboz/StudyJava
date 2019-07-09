package com.zhb.hadoop;

import com.zhb.javaSE.package201904.package_object.extends_test.B;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HDFSClient {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        //conf.set("fs.defaultFS","hdfs://rain-one:9000");
        //1.HDFS于本地用户问题，使用以下改变运行是系统用户
        //System.getProperties().put("HADOOP_USER_NAME","rain");

        //1.获取HDFS客户端对象
        //FileSystem fs = FileSystem.get(conf);
        //1.HDFS于本地用户问题，使用以下设置用户
        FileSystem fs = FileSystem.get(new URI("hdfs://rain-one:9000"), conf, "rain");

        //2.在hdfs上创建路径
        //fs.mkdirs(new Path("/0701/ZHB"));
        //fs.rename(new Path("/0701/ZHB"),new Path("/0701/zhb"));
//        fs.mkdirs(new Path("/0701/zhb/01"));

        //3.关闭资源
        fs.close();

        System.out.println("over!");
    }

    /*
     * @Description: //TODO 文件上传
     * @Date 下午7:17 19-7-1
     * @Param []
     * @return void
     */
    @Test
    public void testCopyFromLocalFile() throws Exception {

        Configuration conf = new Configuration();
        conf.set("dfs.replication", "2");
        //1.获取fs
        FileSystem fs = FileSystem.get(new URI("hdfs://rain-one:9000"), conf, "rain");

        //2.执行上传API
        //fs.copyFromLocalFile(new Path("/home/rainboz/Desktop/emp.txt"), new Path("/xiaohu.txt"));

        //3.关闭资源
        fs.close();
    }

    /*
     * @Description: //TODO 下载文件
     * @Date 下午7:10 19-7-1
     * @Param []
     * @return void
     */
    @Test
    public void testCopyToLocalFile() throws URISyntaxException, IOException, InterruptedException {
        //1.获取fs
        Configuration conf = new Configuration();

        //2.执行下载API
        FileSystem fs = FileSystem.get(new URI("hdfs://rain-one:9000"), conf, "rain");
        //fs.copyToLocalFile(new Path("/user/rain/wcoutput/part-r-00000"), new Path("./"));

        //3.关闭资源
        fs.close();

    }

    /*
     * @Description: //TODO 文件删除
     * @Date 下午7:38 19-7-1
     * @Param []
     * @return void
     */
    @Test
    public void testDelete() throws IOException, URISyntaxException, InterruptedException {
        // 1 获取文件系统
        Configuration conf = new Configuration();
        // 2 执行删除
        FileSystem fs = FileSystem.get(new URI("hdfs://rain-one:9000"), conf, "rain");
        //fs.delete(new Path("/0701/zhb"), true);
        // 3 关闭资源
        fs.close();
        System.out.println();
    }

    /*
     * @Description: //TODO 文件名更改
     * @Date 下午7:40 19-7-1
     * @Param []
     * @return void
     */
    @Test
    public void testRename() throws IOException, URISyntaxException, InterruptedException {
        // 1 获取文件系统
        Configuration conf = new Configuration();
        // 2 修改文件名
        FileSystem fs = FileSystem.get(new URI("hdfs://rain-one:9000"), conf, "rain");
        //fs.rename(new Path("/0701/rainboz/zhb.txt"), new Path("/0701/rainboz/banhua.txt"));
        //释放资源
        fs.close();
    }

    /*
     * @Description: //TODO 查看文件名称，权限，长度，块信息
     * @Date 下午8:02 19-7-1
     * @Param []
     * @return void
     */
    @Test
    public void testListFiles() throws URISyntaxException, IOException, InterruptedException {
        // 1 获取文件系统
        Configuration conf = new Configuration();

        // 2 查看文件详情
        FileSystem fs = FileSystem.get(new URI("hdfs://rain-one:9000"), conf, "rain");
        RemoteIterator<LocatedFileStatus> listFiles = fs.listFiles(new Path("/"), true);
        while (listFiles.hasNext()) {
            LocatedFileStatus fileStatus = listFiles.next();

            //查看文件名称，权限，长度，块信息
            System.out.println(fileStatus.getPath().getName());//文件名
            System.out.println(fileStatus.getPermission());//权限
            System.out.println(fileStatus.getLen());//文件长度

            BlockLocation[] blockLocations = fileStatus.getBlockLocations();
            for (BlockLocation blockLocation : blockLocations) {
                String[] hosts = blockLocation.getHosts();
                for (String host : hosts) {
                    System.out.println(host);
                }
            }
            System.out.println("--------------------------------------------");
        }
        //释放资源
        fs.close();
    }

    /*
     * @Description: //TODO HDFS文件和文件夹判断
     * @Date 下午8:02 19-7-1
     * @Param []
     * @return void
     */
    @Test
    public void testListStatus() throws IOException, URISyntaxException, InterruptedException {
        // 1 获取文件系统
        Configuration conf = new Configuration();

        // 2 文件和文件夹判断
        FileSystem fs = FileSystem.get(new URI("hdfs://rain-one:9000"), conf, "rain");


        FileStatus[] fileStatuses = fs.listStatus(new Path("/"));
        for (FileStatus fileStatus : fileStatuses) {
            if (fileStatus.isFile()) {
                System.out.println("f:" + fileStatus.getPath().getName());
            } else if (fileStatus.isDirectory()) {
                System.out.println("d:" + fileStatus.getPath().getName());
            }
        }

        // 释放资源
        fs.close();
    }
}
