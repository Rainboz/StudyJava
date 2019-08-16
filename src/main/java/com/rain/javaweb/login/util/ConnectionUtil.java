package com.rain.javaweb.login.util;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @progrom StudyJava
 * @Description TODO 连接工具
 * @Author rainboz
 * @Date 2019-08-16 上午10:03
 */
public class ConnectionUtil {
    private static String driver = null;
    private static String url = null;
    private static String username = null;
    private static String password = null;
    private static Properties props = new Properties();

    //ThreadLocal:保证一个线程中只能有一个连接
    private static ThreadLocal<Connection> tl = new ThreadLocal<>();

    /**
     * 静态代码读取db.properties
     */
    static {
        try {
            //file加载指向本地路径，部署后会出现问题
            //        props.load(new FilterInputStream(""));

            //使用类加载器读取文件
            InputStream in = ConnectionUtil.class.getClassLoader().getResourceAsStream("db.properties");
            props.load(in);
            driver = props.getProperty("jdbc.driver");
            url = props.getProperty("jdbc.url");
            username = props.getProperty("jdbc.username");
            password = props.getProperty("jdbc.password");
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /**
     * 获取连接的方法
     */
    public static Connection getConn() throws Exception {
        //先尝试在tl中获取
        //先判断ThreadLocal有没有conn，conn为null，创建连接并添加到ThreadLocal中
        //返回，第二次使用该方法，先判断，有则直接返回conn
        Connection conn = tl.get();
        if (conn == null){
            conn = DriverManager.getConnection(url,username,password);
            tl.set(conn);
        }
        return conn;
    }
    /**
     * 关闭连接资源
     */
    public static void closeConn() throws Exception {
        //只要有连接就是在ThreadLocal中
        Connection conn = tl.get();

        if (conn != null){
            conn.close();
        }
        //连接关闭后设置tl为null，保证下次获取新的连接（conn ==null）
        //不设置tl为null，仅仅关闭了连接，ThreadLocal中仍然有Connection对象
        tl.set(null);

    }

    public static void main(String[] args) throws Exception {
        Connection conn = getConn();

        closeConn();

        Connection conn2 = getConn();

        System.out.println(conn == conn2);

    }


}
