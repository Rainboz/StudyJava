package com.rain.javaweb.login.dao;

import com.rain.javaweb.login.beans.Employee;

import java.util.List;

public interface EmployeeDao {
    /**
     * 查询所有员工信息
     * @return
     */
    public List<Employee> selectAllEmps();

    /**
     * 添加员工
     * @param ee
     * @return
     */
    public int addEmp(Employee ee);
}
