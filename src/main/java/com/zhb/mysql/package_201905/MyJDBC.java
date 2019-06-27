package com.zhb.mysql.package_201905;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-13 上午10:34
 **/
public class MyJDBC {
    //连接信息
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/javaSe";
    static final String USER = "root";
    static final String PASS = "";

    @Test
    public void test() {
        Connection conn = null;
        Statement stmt = null;

        try {
            //建立驱动
            Class.forName(JDBC_DRIVER);
            //建立连接
            conn = DriverManager.getConnection(URL, USER, PASS);

            System.out.println(conn);

            stmt = conn.createStatement();
            //sql
            String sql = "update user set user_name='笑着拉丝机' where user_id = '6'";
            String sql2 = "select * from hobby where user_id = '6'";

            ResultSet rs = stmt.executeQuery("SELECT * from user ");
            rs.last();
            System.out.println("rs");
            ResultSet rs2 = stmt.executeQuery(sql2);
            rs2.last();
            System.out.println("rs2");
            while (rs2.next()) {
                String hobbyContent = rs2.getString("hobby_content");
                int userId = rs.getInt("user_id");
                System.out.println("hobbyContent:" + hobbyContent);
                System.out.println("userId:" + userId);
                System.out.println();
            }
            /*int updateNum = stmt.executeUpdate(sql);

            if (updateNum == 1){
                System.out.println("更新成功，返回："+updateNum);
            }else {
                System.out.println("更新失败,返回："+updateNum);
            }*/
            int i = 0;
            while (rs.next()) {
                int userId = rs.getInt("user_id");
                String userName = rs.getString("user_name");
                int age = rs.getInt("age");
                String sex = rs.getString("sex");

                ++i;
                System.out.println("-------------第" + i + "个记录-------------");
                System.out.println("userId:" + userId);
                System.out.println("userName:" + userName);
                System.out.println("age:" + age);
                System.out.println("sex:" + sex);

            }
            // 完成后关闭
            rs.close();
            rs2.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}














