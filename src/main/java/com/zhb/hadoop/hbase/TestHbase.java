package com.zhb.hadoop.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;

import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    private static Configuration conf = null;

    static {
        conf = HBaseConfiguration.create();
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

        if (!tableExist(tableName)) {
            return;
        }
        //使表不可用（下线）
        admin.disableTable(TableName.valueOf(tableName));

        //执行删除操作
        admin.deleteTable(TableName.valueOf(tableName));

        System.out.println("表已经删除！");
    }

    //增|改
    public static void putData(String tableName, String rowKey, String cf, String cn, String value) throws IOException {

        //获取表对象
        Table table = conn.getTable(TableName.valueOf(tableName));
        //        HTable hTable = new HTable(conf, TableName.valueOf(tableName));

        //创建Put对象
        Put put = new Put(Bytes.toBytes(rowKey));

        //添加数据
        put.addColumn(Bytes.toBytes(cf), Bytes.toBytes(cn), Bytes.toBytes(value));

        //执行添加操作
        table.put(put);
        //关闭资源
        table.close();
    }

    //执行添加到指定表API操作
    public static void putByTable(String tableName, List<Put> puts) throws IOException {
        //获取表对象
        Table table = conn.getTable(TableName.valueOf(tableName));

        //批量添加数据，一条数据一个对象添加到List<Put>集合中，判断put集合数据条数进行put()操作
        if (puts.size() >= 5) {
            //执行操作
            table.put(puts);
        }
        table.close();
    }

    //批量添加数据
    public static void putListData() throws IOException {
        //批量添加数据
        System.out.println("-------------------批量添加数据----------------");
        List<Put> puts = new ArrayList<>();

        //循环添加数据
        for (int i = 1; i <= 5; i++) {
            //rowkey
            byte[] row = Bytes.toBytes("row" + i * 2);

            //创建put对象
            Put put = new Put(row);

            //cf:error--->添加数据时报错，没有指定的cf（列簇）
            byte[] columnFamily = Bytes.toBytes("info");

            //cn(列名)
            byte[] qualifier = Bytes.toBytes(String.valueOf(i * 2));

            //value(值)
            byte[] value = Bytes.toBytes("value" + i * 2);

            put.addColumn(columnFamily, qualifier, value);
            //
            puts.add(put);
        }
        //执行添加到指定表API操作
        putByTable("student", puts);

        //输出list信息
        for (Put x : puts) {
            System.out.println(x);
        }
        System.out.println("-------------------批量添加数据----------------");
    }

    //删
    public static void delete(String tableName,String rowkey,String cf,String cn) throws IOException {
        //获取表对象
        Table table = conn.getTable(TableName.valueOf(tableName));

        //创建Delete对象
        Delete delete = new Delete(Bytes.toBytes(rowkey));

        //删除最新的版本，可指定删除版本
        delete.addColumn(Bytes.toBytes(cf),Bytes.toBytes(cn));

        //删除所有版本
        //delete.addColumns(Bytes.toBytes(cf),Bytes.toBytes(cn));

        //执行操作
        table.delete(delete);

        //关闭资源
        table.close();

    }
    //查

    public static void main(String[] args) throws IOException {


        //        deleteTable("stu");
        //
        //        System.out.println(tableExist("stu"));
        System.out.println(tableExist("student"));

        //putData("student", "1001", "info", "name", "zhangyvaini");

        //批量添加数据
        //putListData();
        delete("student","row10","info","10");

        close(conn, admin);
    }
}
