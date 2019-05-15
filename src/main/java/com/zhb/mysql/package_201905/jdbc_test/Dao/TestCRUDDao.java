package com.zhb.mysql.package_201905.jdbc_test.Dao;

import com.zhb.mysql.package_201905.jdbc_test.Student;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-14 11:23
 **/
public class TestCRUDDao {
    public static void main(String[] args) {
        String sql = "insert into user(?,?,?,?)";
        //CRUDDao.genUpdate(sql, 123465, "徐子鹏", 545, "男");
        //列名不一样
        String sql2 = "select type,id_card,exam_card,student_name,location,grade from eaxmstudent where grade >= ?";
        Student s = CRUDDao.read(Student.class, sql2, 90);
        System.out.println(s);
    }
}
