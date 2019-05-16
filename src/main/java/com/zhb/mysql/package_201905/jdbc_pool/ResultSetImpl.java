package com.zhb.mysql.package_201905.jdbc_pool;

import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-15 15:16
 **/
public class ResultSetImpl<T> implements ResultSetHandler<T> {
    @Override
    public T handle(ResultSet resultSet) throws SQLException {
        while (resultSet.next()){
            int user_id = resultSet.getInt("user_id");
            String pass = resultSet.getString("password");
            String user_name = resultSet.getString("user_name");
            int age = resultSet.getInt("age");
            String sex = resultSet.getString("sex");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("user_id: "+user_id);
            System.out.println("pass: "+pass);
            System.out.println("user_name: "+user_name);
            System.out.println("age: "+age);
            System.out.println("sex: "+sex);
            //System.out.println("-------------------------------------------------------------------");
        }
        return null;
    }
}
