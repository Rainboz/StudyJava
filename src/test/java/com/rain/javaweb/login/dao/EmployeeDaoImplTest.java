package com.rain.javaweb.login.dao;

import com.google.gson.Gson;
import com.rain.javaweb.login.beans.Department;
import com.rain.javaweb.login.beans.Employee;
import com.rain.javaweb.login.util.DataUtil;
import org.junit.Test;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class EmployeeDaoImplTest {
    EmployeeDao employeeDao = new EmployeeDaoImpl();

    @Test
    public void selectAllEmps() {
        List<Employee> list = employeeDao.selectAllEmps();

        for(Employee employee : list){
            System.out.println(employee);
        }
        Gson gson = new Gson();
        String s = gson.toJson(list);
        System.out.println(s);
    }

    @Test
    public void addEmp() {
        Employee employee = new Employee();
        Department department = new Department();

        Random random = new Random();
        int[] ary = {0, 1, 2, 3, 4};
        String lastName = "";
        String email = "";
        String sex = "";
        int did = 0;
        for (int i = 0; i < 10; i++) {
            lastName = DataUtil.getStringRandom(3);
            email = DataUtil.getEmail(5, 9);
            sex = DataUtil.getSex();
            did = ary[random.nextInt(ary.length)];
            if (sex.equals("男")) {
                employee.setGender(1);
            } else if (sex.equals("女")) {
                employee.setGender(0);
            }
            employee.setId(Integer.parseInt("200" + i));
            employee.setLastName(lastName);
            employee.setEmail(email);

            if (did == 0) {
                department.setDeptName(null);
            } else if (did == 1) {
                department.setDeptName("研发部");
            } else if (did == 2) {
                department.setDeptName("测试部");
            } else if (did == 3) {
                department.setDeptName("财务部");
            } else if (did == 4) {
                department.setDeptName("人事部");
            }
            department.setId(did);

            employee.setDept(department);
            System.out.println(employeeDao.addEmp(employee));
        }
    }
}