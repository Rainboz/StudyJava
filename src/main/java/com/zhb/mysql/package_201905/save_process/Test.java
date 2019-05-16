package com.zhb.mysql.package_201905.save_process;

import com.zhb.mysql.package_201905.jdbc_test.JDBCTool;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 * @program: StudyJava
 * @description: 调用存储过程
 * @author: rainboz
 * @create: 2019-05-15 16:30
 **/
public class Test {
    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = JDBCTool.getConnection();
//            cs = conn.prepareCall("{call my_p3(?,?)}");
//            cs.setString();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
