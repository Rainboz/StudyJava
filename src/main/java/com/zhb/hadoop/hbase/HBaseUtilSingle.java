package com.zhb.hadoop.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

import java.io.IOException;

/**
 * @program: StudyJava
 * @description: 建立连接公共操作类：（单例方式）虚拟机里只存在一个这样的实例 通过getInstance方式获取对象
 * @author: rainboz
 * @create: 2019-07-30 16:38
 **/
public class HBaseUtilSingle {
    private static Admin admin = null;
    //获取连接对象
    private static Connection conn = null;

    //private static Configuration conf = null;

    //私有构造方法,不允许构造
    public HBaseUtilSingle() {
    }

    // 构造私有实例
    // private static HBaseUtilSingle instance = new HBaseUtilSingle() ;
    private static HBaseUtilSingle instance = null;

    public static HBaseUtilSingle getInstance() {
        //延迟加载
        if (instance == null) {
            //加锁 防止线程并发
            synchronized (HBaseUtilSingle.class) {
                //必须有的判断
                if (instance == null) {
                    instance = new HBaseUtilSingle();
                }
            }
        }
        return instance;
    }

    //注册连接信息，获取hbase管理用户
    static {
        Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum", "hadoop-zhb004.com");
        System.setProperty("hadoop.home.dir","E:\\tools\\hadoop-2.7.2");
        try {
            conn = ConnectionFactory.createConnection(conf);
            admin = conn.getAdmin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
