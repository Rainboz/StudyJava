package com.rain.javaweb.login.dao;

import com.rain.javaweb.login.beans.Student;

import java.util.List;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-22 上午11:36
 */
public interface StudentDao {
    /*
     * @Description: //TODO 查询学生列表
     * @Date 下午2:36 19-8-22
     * @Param []
     * @return java.util.List<com.rain.javaweb.login.beans.Student>
     */
    public List<Student> getStudentList();

    /*
     * @Description: //TODO 通过学号stu_id查询学生信息
     * @Date 下午2:37 19-8-22
     * @Param [stuId]
     * @return com.rain.javaweb.login.beans.Student
     */
    public Student selectByStuId(int stuId);

    /*
     * @Description: //TODO 通过ID查询学生信息
     * @Date 下午3:24 19-8-22
     * @Param [id]
     * @return com.rain.javaweb.login.beans.Student
     */
    public Student selectById(int id);

    /*
     * @Description: //TODO 添加学生
     * @Date 下午3:11 19-8-22
     * @Param [student]
     * @return boolean
     */
    public boolean addStudent(Student student);

    /*
     * @Description: //TODO 删除学生
     * @Date 下午3:32 19-8-22
     * @Param [stu_id]
     * @return int
     */
    public int deteleStudent(int stu_id);

    /*
     * @Description: //TODO 更新学生信息
     * @Date 下午3:30 19-8-22
     * @Param [student]
     * @return int
     */
    public int updateStudent(Student student);

}
