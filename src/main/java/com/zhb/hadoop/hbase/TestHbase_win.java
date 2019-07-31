package com.zhb.hadoop.hbase;

import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;


import java.io.IOException;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-07-30 16:22
 **/
public class TestHbase_win {
    //判断表是否存在
    public static boolean tableExist(String tableName) throws IOException {
        //Hbase配置文件
        //获取连接对象
//        Connection conn = HBaseUtil.getConn();
        //获取hbase管理员对象
        Admin admin = HBaseUtil.admin;
        //执行
        boolean tableExists = admin.tableExists(TableName.valueOf(tableName));
        return tableExists;
    }

    //创建表:可变形参，可以创建多个列族
    public static void createTable(String tableName, String... cfs) throws IOException {
        if (tableExist(tableName)) {
            System.out.println("表已经存在!!");
            return;
        }
        //创建表描述器
        HTableDescriptor hTableDescriptor = new HTableDescriptor(TableName.valueOf(tableName));

        //添加列族
        for (String cf : cfs) {
            HColumnDescriptor hColumnDescriptor = new HColumnDescriptor(cf);
            hTableDescriptor.addFamily(hColumnDescriptor);
        }
        //创建表操作
        HBaseUtil.admin.createTable(hTableDescriptor);
        System.out.println("表创建成功!!");
    }

    public static void main(String[] args) throws IOException {
        System.out.println(tableExist("student"));
        //createTable("student","info:name");
        //System.out.println(tableExist("student"));
        //释放资源
        HBaseUtil.close(HBaseUtil.conn, HBaseUtil.admin);

    }
}
