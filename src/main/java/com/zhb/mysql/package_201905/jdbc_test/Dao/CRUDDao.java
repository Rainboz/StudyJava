package com.zhb.mysql.package_201905.jdbc_test.Dao;

import com.zhb.mysql.package_201905.jdbc_test.JDBCTool;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * @program: StudyJava
 * @description: create, update, delete, read
 * @author: rainboz
 * @create: 2019-05-14 11:16
 **/
public class CRUDDao {
    //封装一个通用的修改方法
    public static void genUpdate(String sql, Object... obj) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCTool.getConnection();
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < obj.length; i++) {
                pstmt.setObject(i + 1, obj[i]);
            }
            //执行sql语句
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //清理资源
            JDBCTool.myClose(rs, pstmt, conn);
        }
    }

    //封装一个通用的查询方法
    public static  <T> T read(Class<T> tClass, String sql, Object... obj) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            T t = tClass.newInstance();
            conn = JDBCTool.getConnection();
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < obj.length; i++) {
                pstmt.setObject(i + 1, obj[i]);
            }
            rs = pstmt.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int count = metaData.getColumnCount();
            if (rs.next()) {
                for (int i = 0; i < count; i++) {

                    String name = metaData.getColumnLabel(i + 1);
                    //System.out.println(name);
                    Field field = tClass.getDeclaredField(name);
                    field.setAccessible(true);
                    field.set(t, rs.getObject(i + 1));

                }
            }
            return t;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } finally {
            JDBCTool.myClose(rs, pstmt, conn);
        }
        return null;
    }
}
