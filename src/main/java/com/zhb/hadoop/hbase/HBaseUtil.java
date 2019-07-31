package com.zhb.hadoop.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

import java.io.IOException;

/**
 * @program: StudyJava
 * @description: 建立连接公共操作类：（静态方式）
 * @author: rainboz
 * @create: 2019-07-30 16:18
 **/
public class HBaseUtil {
    public static Admin admin;
    //获取连接对象
    public static Connection conn;

    public static Configuration conf;

    //私有构造方法,不允许构造
    private HBaseUtil() {
    }

    //注册连接信息，获取hbase管理用户
    static {
        conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum", "hadoop-zhb004.com");
        //win10下报错：Failed to locate the winutils binary in the hadoop binary path
        //Could not locate executable null\bin\winutils.exe in the Hadoop binaries.
        conf.set("hbase.zookeeper.property.clientPort", "2181");
        System.setProperty("hadoop.home.dir", "E:\\tools\\hadoop-2.7.2");
        try {
            conn = ConnectionFactory.createConnection(conf);
            admin = conn.getAdmin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

/*    //获取admin
    public static Admin getAdmin() {
        return admin;
    }

    //获取连接
    public static Connection getConn() {
        return conn;
    }*/

    //关闭连接资源
    public static void close(Connection conn, Admin admin) {
        if (conn != null) {
            try {
                conn.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (admin != null) {
            try {
                admin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
