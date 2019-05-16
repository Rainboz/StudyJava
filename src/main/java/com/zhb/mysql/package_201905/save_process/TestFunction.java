package com.zhb.mysql.package_201905.save_process;

import com.zhb.mysql.package_201905.jdbc_test.JDBCTool;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 * @program: StudyJava
 * @description: 调用函数
 * @author: rainboz
 * @create: 2019-05-15 16:51
 **/
public class TestFunction {
    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = JDBCTool.getConnection();
            cs = conn.prepareCall("{?=call my_f1()}");

//            cs.registerOutParameter();
            //执行
            cs.execute();
            System.out.println(cs);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
