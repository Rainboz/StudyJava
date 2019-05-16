package com.zhb.mysql.package_201905.jdbc_pool;

import com.zhb.mysql.package_201905.jdbc_test.JDBCTool;
import com.zhb.mysql.package_201905.jdbc_test.Student;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-15 10:36
 **/
public class pool_test {

    @Test
    public void test() {
        //声明Java自己接口   实现dbcp中的实现类
        DataSource ds = new BasicDataSource();

        BasicDataSource bds = new BasicDataSource();
        //建立驱动
        bds.setDriverClassName("com.mysql.jdbc.Driver");
        //设置连接信息
        bds.setUrl("jdbc:mysql://localhost:3306/javase");
        bds.setUsername("root");
        bds.setPassword("root");
        //
        Connection conn = null;
        try {
            conn = bds.getConnection();
            //初始化连接数
            bds.setInitialSize(10);
            //最大空闲数
            bds.setMaxIdle(10);
            bds.setMaxActive(10);
            //最大等待时长
            bds.setMaxWait(3000);
            System.out.println(conn);
            System.out.println(bds.getInitialSize());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() throws IOException {

        Connection con =null;
       try {
           //用的是resources下的jdbc.properties
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("jdbc.properties");

            Properties ps = new Properties();
            /*ps.setProperty("driverClassName","com.mysql.jdbc.Driver");
            ps.setProperty("url","jdbc:mysql://localhost:3306/javaSe");
            ps.setProperty("username","root");
            ps.setProperty("password","root");
            ps.setProperty("useSSL","true");
            ps.setProperty("autoReconnect", "true");*/
            ps.load(inputStream);
           System.out.println(ps.getProperty("url")+"--"+ps.getProperty("password")+
                   "--"+ps.getProperty("driverClassName")+"--"+ps.getProperty("username"));
            BasicDataSourceFactory bdsf = new BasicDataSourceFactory();

           // BasicDataSource dataSource = (BasicDataSource) new BasicDataSourceFactory().createDataSource(ps);
           //DataSource dataSourceFactory =   BasicDataSourceFactory.createDataSource(ps);
            DataSource dataSourceFactory =  bdsf.createDataSource(ps);

           con =  dataSourceFactory.getConnection();
            System.out.println(con);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test3(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "insert into user(password,user_name,age,sex)values('550320023','rainboz','21','男')";
        String sql2 = "select * from user ";
       // ResultSetImpl<Student> resultSet = new ResultSetImpl();
        try {
            conn = JDBCTool.getConnection();
            QueryRunner qr = new QueryRunner();
//            qr.execute(conn,sql);//插入sql语句中的信息
            qr.query(conn,sql2,new ResultSetImpl<Student>());

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTool.myClose(rs,null,conn);
        }
    }

    @Test
    public void testc3p0(){
        /*
         *
         */
    }

    @Test
    public void testBeanHandler(){
        Connection conn = null;
        //Student   bean 中的属性和数据库表中的列名不一样，需要取别名
        String sql = "select flow_id flowId,type,id_card idCard,exam_card examCard,student_name studentName,location,grade from eaxmstudent";
        try {
            conn = JDBCTool.getConnection();
            QueryRunner qr = new QueryRunner();
            List<Student> s = qr.query(conn,sql,new BeanListHandler<Student>(Student.class));
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
