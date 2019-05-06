package com.zhb.mysql;



import java.sql.*;

/**
 * @program: StudyJava
 * @description: mysql连接
 * @author: rainboz
 * @create: 19-5-6 上午10:14
 **/
public class Test {
    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/javaSe";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            String sql2;
            sql = "SELECT * FROM user";
            sql2 = "select A.*,B.hobby_name,B.hobby_content,B.hobby_id,COUNT(1) as 爱好个数 " +
                    "from user A left join hobby B " +
                    "on A.user_id = B.user_id " +
                    "where A.user_id =2 GROUP BY B.hobby_id";
           // ResultSet rs2 = stmt.executeQuery(sql);

            ResultSet rs = stmt.executeQuery(sql2);



            //创建user对象
            User user = new Hobby();
            Hobby h = (Hobby) user;
           /* while (rs2.next()){
                int userId = rs2.getInt("user_id");
                String userName = rs2.getString("user_name");
                int age = rs2.getInt("age");
                String sex = rs2.getString("sex");
                user.setUserId(userId);
                user.setUserName(userName);
                user.setAge(age);
                user.setSex(sex);
            }
            //输出用户信息
            System.out.println(user);*/
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                String hobby_name  = rs.getString("hobby_name");
                String hobby_content = rs.getString("hobby_content");
                String user_name = rs.getString("user_name");
                int user_id = rs.getInt("user_id");
                int hobby_id = rs.getInt("hobby_id");
                int num = rs.getInt("爱好个数");
                int age = rs.getInt("age");
                String sex = rs.getString("sex");
                h.setHobbyId(hobby_id);
                h.setHobbyName(hobby_name);
                h.setHobbyContent(hobby_content);

                user.setUserId(user_id);
                user.setUserName(user_name);
                user.setAge(age);
                user.setSex(sex);
                h.setUser(user);
                //h.setUser(user);
//                h.setUserId(user_id);
//                h.setUserName(user_name);
//                h.setAge(age);
//                h.setSex(sex);

                //输出用户爱好信息
                System.out.println(h);

                // 输出数据
                System.out.print("hobby_name: " + hobby_name);
                System.out.print("hobby_content: " + hobby_content);
                System.out.print("user_name: " + user_name);
                System.out.print(", user_id: " + user_id);
                System.out.print(", hobby_id: " + hobby_id);
                System.out.print(", 爱好个数: " + num);
                System.out.print(", age: " + age);
                System.out.print(", sex: " + sex);
                System.out.print("\n");
                System.out.println();
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}

