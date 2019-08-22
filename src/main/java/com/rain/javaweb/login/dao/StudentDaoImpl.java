package com.rain.javaweb.login.dao;

import com.rain.javaweb.login.beans.Student;
import com.rain.javaweb.login.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-22 上午11:47
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> getStudentList() {
        Student stu = null;
        List<Student> list = new ArrayList<>();
        try {
            //获取连接
            Connection conn = ConnectionUtil.getConn();

            //sql语句
            String sql = "SELECT id,stu_id,name,sex,age,phone from student";
            PreparedStatement ps = conn.prepareStatement(sql);
          /* 有问号才要set，查询不需要set
            ps.setInt(1,1);
            ps.setInt(2,1);
            ps.setString(3,student.getName());
            ps.setString(4,student.getSex());
            ps.setInt(5,student.getAge());
            ps.setString(6,student.getPhone());*/
            //执行sql
            ResultSet rs = ps.executeQuery();

            //返回结果集
            while (rs.next()) {
                stu = new Student();
                stu.setId(rs.getInt("id"));
                stu.setStuId(rs.getInt("stu_id"));
                stu.setName(rs.getString("name"));
                stu.setSex(rs.getString("sex"));
                stu.setAge(rs.getInt("age"));
                stu.setPhone(rs.getString("phone"));
                list.add(stu);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectionUtil.closeConn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Student selectByStuId(int stuId) {
        Student stu = null;
        try {
            Connection conn = ConnectionUtil.getConn();

            String sql = "select * from student where stu_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, stuId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                stu = new Student();
                stu.setId(rs.getInt("id"));
                stu.setStuId(rs.getInt("stu_id"));
                stu.setName(rs.getString("name"));
                stu.setSex(rs.getString("sex"));
                stu.setAge(rs.getInt("age"));
                stu.setPhone(rs.getString("phone"));
            }
            return stu;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectionUtil.closeConn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Student selectById(int id) {
        Student stu = null;
        try {
            Connection conn = ConnectionUtil.getConn();

            String sql = "select * from student where id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                stu = new Student();
                stu.setId(rs.getInt("id"));
                stu.setStuId(rs.getInt("stu_id"));
                stu.setName(rs.getString("name"));
                stu.setSex(rs.getString("sex"));
                stu.setAge(rs.getInt("age"));
                stu.setPhone(rs.getString("phone"));
            }
            return stu;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectionUtil.closeConn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public boolean addStudent(Student student) {
        Student stu = null;
        try {
            Connection conn = ConnectionUtil.getConn();

            String sql = "insert into student(stu_id,name,sex,age,phone)values (?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, student.getStuId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getSex());
            ps.setInt(4, student.getAge());
            ps.setString(5, student.getPhone());

            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectionUtil.closeConn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public int deteleStudent(int stu_id) {
        try {
            Connection conn = ConnectionUtil.getConn();
            String sql = "DELETE FROM student WHERE stu_id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,stu_id);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectionUtil.closeConn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int updateStudent(Student student) {

        try {
            Connection conn = ConnectionUtil.getConn();
            String sql = "UPDATE  student set  name = ?,sex = ?,age = ?,phone=? where stu_id= ?;";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,student.getName());
            ps.setString(2,student.getSex());
            ps.setInt(3,student.getAge());
            ps.setString(4,student.getPhone());
            ps.setInt(5,student.getStuId());
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectionUtil.closeConn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
