package com.rain.javaweb.login.beans;

/**
 * @program: StudyJava
 * @description: 部门表
 * @author: rainboz
 * @create: 2019-08-26 14:27
 **/
public class Department {
    private Integer id;
    private String deptName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
