package com.rain.javaweb.login.dao;

import com.rain.javaweb.login.beans.User;
import com.rain.javaweb.login.util.ConnectionUtil;
import com.rain.javaweb.login.util.JDBCTool;

import java.sql.*;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-15 下午7:30
 */
public class UserDaoImpl implements UserDao {
    @Override
    public User getUserByUsernameAndPassword(String username, String password) {
        //JDBC:，编写sql，预编译sql，设置参数，执行sql，封装结果，关闭连接
        //1. 获取连接
        User u = null;
       /* Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;*/
        try {
            /*Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/rain0803";
            String user = "root";
            String pwd = "root";
            conn = DriverManager.getConnection(url, user, pwd);*/

            //             conn = JDBCTool.getConnection();
            Connection conn = ConnectionUtil.getConn();
            String sql = "select id,username,password from user where username = ? and password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u = new User();
                u.setId(rs.getInt("id"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
            }
            //System.out.println(u.toString());
            return u;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            JDBCTool.myClose(rs, ps, conn);
            try {
                ConnectionUtil.closeConn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
