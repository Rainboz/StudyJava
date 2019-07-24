package com.zhb.hadoop.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

import org.junit.Test;

import java.io.IOException;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-07-24 下午6:14
 */
public class TestHbase {

    private static Admin admin = null;
    //获取连接对象
    private static Connection conn = null;

    static {
        Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum", "rain01");
        try {
            conn = ConnectionFactory.createConnection(conf);
            admin = conn.getAdmin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void close(Connection conn, Admin admin) {
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

    //判断表是否存在
    public static boolean tableExist(String tableName) throws IOException {
        //Hbase配置文件
        //HBaseConfiguration conf = new HBaseConfiguration();
        Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum", "rain01");
        conf.set("hbase.zookeeper.property.clientPort", "2181");

        //获取连接对象
        Connection conn = ConnectionFactory.createConnection(conf);
        Admin admin = conn.getAdmin();

        //获取hbase管理员对象
        //HBaseAdmin admin = new HBaseAdmin(conf);

        //执行
        //boolean tableExists = adimn.tableExists(tableName);
        boolean tableExists = admin.tableExists(TableName.valueOf(tableName));

        //释放资源
        admin.close();

        return tableExists;
    }

    //创建表:可变形参，可以创建多个列族
    public static void createTable(String tableName, String... cfs) throws IOException {

        if (tableExist(tableName)) {
            System.out.println("表已经存在");
            return;
        }
        //创建表描述器
        HTableDescriptor hTableDescriptor = new HTableDescriptor(TableName.valueOf(tableName));

        //添加列族
        for (String cf : cfs) {
            //添加列描述器
            HColumnDescriptor hColumnDescriptor = new HColumnDescriptor(cf);
            hTableDescriptor.addFamily(hColumnDescriptor);
        }

        //创建表操作
        admin.createTable(hTableDescriptor);
        System.out.println("表创建成功");
    }

    //删除表
    public static void deleteTable(String tableName) throws IOException {

        if (!tableExist(tableName)){
            return;
        }
        //使表不可用（下线）
        admin.disableTable(TableName.valueOf(tableName));

        //执行删除操作
        admin.deleteTable(TableName.valueOf(tableName));

        System.out.println("表已经删除！");
    }

    //增|改

    //删

    //查

    public static void main(String[] args) throws IOException {


        deleteTable("stu");

        System.out.println(tableExist("stu"));
        close(conn,admin);
    }
}
