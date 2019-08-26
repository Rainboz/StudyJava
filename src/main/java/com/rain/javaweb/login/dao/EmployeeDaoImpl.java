package com.rain.javaweb.login.dao;

import com.rain.javaweb.login.beans.Department;
import com.rain.javaweb.login.beans.Employee;
import com.rain.javaweb.login.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-08-26 14:30
 **/
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public List<Employee> selectAllEmps() {
        List<Employee> list = new ArrayList<>();
        try {
            Connection conn = ConnectionUtil.getConn();
            String sql = "SELECT e.id eid,e.last_name,e.email,e.gender,d.id did,d.dept_name " +
                    "from employee e,dept d WHERE e.d_id = d.id; ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("eid"));
                employee.setLastName(rs.getString("last_name"));
                employee.setEmail(rs.getString("email"));
                employee.setGender(rs.getInt("gender"));

                Department department = new Department();
                department.setId(rs.getInt("did"));
                department.setDeptName(rs.getString("dept_name"));
                employee.setDept(department);

                list.add(employee);
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
    public int addEmp(Employee ee) {
        Employee e1 = null;
        try {
            Connection conn = ConnectionUtil.getConn();
            String sql = "insert into employee(id,last_name,email,gender,d_id)VALUES(?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ee.getId());
            ps.setString(2, ee.getLastName());
            ps.setString(3, ee.getEmail());
            ps.setInt(4, ee.getGender());
            ps.setInt(5, ee.getDept().getId());
            int i = ps.executeUpdate();
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
