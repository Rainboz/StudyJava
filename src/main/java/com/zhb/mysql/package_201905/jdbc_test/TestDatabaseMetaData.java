package com.zhb.mysql.package_201905.jdbc_test;

import java.sql.*;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-14 10:50
 **/
public class TestDatabaseMetaData {
    public void test(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCTool.getConnection();
            DatabaseMetaData dbmd = conn.getMetaData();
            String url = dbmd.getURL();
            System.out.println(url);

            String sql = "select * from user";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int count  = metaData.getColumnCount();
            System.out.println(count);
            for (int i = 1; i <= count; i++) {
                System.out.println(metaData.getColumnLabel(i));
                System.out.println(metaData.getColumnType(i));
                //System.out.println(metaData.getColumnName(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTool.myClose(null,null,conn);
        }
    }
    public static void main(String[] args) throws SQLException {
        TestDatabaseMetaData td = new TestDatabaseMetaData();
        td.test();
    }
}
