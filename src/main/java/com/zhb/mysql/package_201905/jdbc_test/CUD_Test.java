package com.zhb.mysql.package_201905.jdbc_test;

import com.zhb.javaSE.Stu;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @program: StudyJava
 * @description: 增，删，改
 * @author: rainboz
 * @create: 2019-05-13 14:30
 **/
public class CUD_Test {

    public static Student getStudent() {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("插入一个新学生信息,请输入考生的详细信息：");
        System.out.print("type: ");
        int type = sc.nextInt();

        System.out.println("idCard: ");
        String idCard = sc.next();

        System.out.println("examCard: ");
        String examCard = sc.next();

        System.out.println("studentName: ");
        String studentName = sc.next();

        System.out.println("location: ");
        String location = sc.next();

        System.out.println("grade: ");
        int grade = sc.nextInt();

        s.setType(type);
        s.setIdCard(idCard);
        s.setExamCard(examCard);
        s.setStudentName(studentName);
        s.setLocation(location);
        s.setGrade(grade);
        return s;
    }

    public void addStu(Student s) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCTool.getConnection();
            String sql7 = "insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) " +
                    "VALUES(" + s.getType() + "," + "'" + s.getIdCard() + "'" + "," + "'" + s.getExamCard() +
                    "'" + "," + "'" + s.getStudentName() + "'" +
                    "," + "'" + s.getLocation() + "'" + "," + s.getGrade() + ")";
            stmt = conn.createStatement();
            //stmt  空指针异常，原因conn没有创建createStatement();导致stmt空指针异常；
            System.out.println("执行的sql语句: " + sql7);
            stmt.executeUpdate(sql7);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTool.myClose(rs, stmt, conn);
        }
    }

    @Test
    public void insert() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
//        System.out.println(conn);
        // 执行批量插入学生数据
        /**
         * insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('4','412824195263214584','200523164754000','张峰','郑州','85')
         * insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('4','222224195263214584','200523164754001','孙鹏','大连','56')
         * insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('6','342824195263214584','200523164754002','刘明','沈阳','72')
         * insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('6','100824195263214584','200523164754003','赵虎','哈尔滨','95')
         * insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('4','454524195263214584','200523164754004','杨丽','北京','64')
         * insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('4','854524195263214584','200523164754005','王小红','太原','60')
         */
        try {
            conn = JDBCTool.getConnection();
            String sql1 = "insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('4','412824195263214584','200523164754000','张峰','郑州','85')";
            String sql2 = "insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('4','222224195263214584','200523164754001','孙鹏','大连','56')";
            String sql3 = "insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('6','342824195263214584','200523164754002','刘明','沈阳','72')";
            String sql4 = "insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('6','100824195263214584','200523164754003','赵虎','哈尔滨','95')";
            String sql5 = "insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('4','454524195263214584','200523164754004','杨丽','北京','64')";
            String sql6 = "insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) VALUES('4','854524195263214584','200523164754005','王小红','太原','60')";
            //String sql7 = "insert into eaxmstudent(type,id_card,exam_card,student_name,location,grade) " +
            //      "VALUES(" + type + ",+" + idCard + "," + examCard + "," + studentName + "," + location + ","+grade+")";

            stmt = conn.createStatement();
            stmt.addBatch(sql1);
            stmt.addBatch(sql2);
            stmt.addBatch(sql3);
            stmt.addBatch(sql4);
            stmt.addBatch(sql5);
            stmt.addBatch(sql6);
            //stmt.addBatch(sql7);
            //执行sql
            stmt.executeBatch();
            //清理
            stmt.clearBatch();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCTool.myClose(rs, stmt, conn);
        }
        System.out.println("Goodbye!");
    }


    public static void findStuByIdCardOrExamCard() {
        /*
         *功能描述 @description: TODO
         * @date 2019/5/13 18:29
         * @param []
         * @return void
         */
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Scanner sc = new Scanner(System.in);

            //判断输入查询类型
            String idType = idType();
            // System.out.println("查询类型:" + idType);
            //输入正确后执行查询
            //获取连接
            conn = JDBCTool.getConnection();
            stmt = conn.createStatement();
            if (idType.equals("b")) {
                //使用身份证查询学生信息
                System.out.println("输入您需要查询学生信息的身份证号：");
                String inId = sc.next();
                String sql2 = "select * from eaxmstudent where id_card =" + "'" + inId + "'";
                rs = stmt.executeQuery(sql2);
                while (rs.next()) {
                    int flowId = rs.getInt("flow_id");
                    int type = rs.getInt("type");
                    String idCard = rs.getString("id_card");
                    String examCard = rs.getString("exam_card");
                    String studentName = rs.getString("student_name");
                    String location = rs.getString("location");
                    int grade = rs.getInt("grade");
                    Student s = new Student(flowId, type, idCard, examCard, studentName, location, grade);
                    System.out.println(s);
                }
            } else if (idType.equals("a")) {
                //使用准考证号查询学生信息
                System.out.println("输入您需要查询学生信息的准考证号：");
                String inId = sc.next();
                String sql = "select * from eaxmstudent where exam_card = " + "'" + inId + "'";
                rs = stmt.executeQuery(sql);
                //遍历信息
                while (rs.next()) {
                    int flowId = rs.getInt("flow_id");
                    int type = rs.getInt("type");
                    String idCard = rs.getString("id_card");
                    String examCard = rs.getString("exam_card");
                    String studentName = rs.getString("student_name");
                    String location = rs.getString("location");
                    int grade = rs.getInt("grade");
                    Student s = new Student(flowId, type, idCard, examCard, studentName, location, grade);
                    System.out.println(s);
                }
            } else {
                System.out.println("您输入有误！请重新进入程序");
            }
            //清理

           /* rs.close();
            stmt.close();
            conn.close();*/
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTool.myClose(rs, stmt, conn);
        }

    }

    //输入查询类型
    public static String idType() {
        //默认使用准考证号查询
        Scanner sc = new Scanner(System.in);
        String id_type = "a";
        System.out.println("请选择您要输入的类型：");
        System.out.println("      a:准考证号");
        System.out.println("      b:身份证号");
        id_type = sc.next();
        /*if (id_type.equals("b")) {
            System.out.println("您选择使用身份证号查询信息！");
            return id_type;
        } else if (id_type.equals("a")) {
            System.out.println("您选择使用准考证号查询信息！");
            return id_type;
        } else {
            System.out.println("您输入有误！请重新进入程序");
        }
        return "";*/
        return id_type;
    }

    public static void main(String[] args) {
        /* //执行批量插入学生数据,sql语句写死在insert()中
         *//*insert();*//*
        //插入一个新学生信息
        Student s = getStudent();
        System.out.println(s);

        CUD_Test c = new CUD_Test();
        c.addStu(s);*/

        findStuByIdCardOrExamCard();
    }
}
