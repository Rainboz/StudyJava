package com.rain.javaweb.login.beans;

/**
 * @program: StudyJava
 * @description: 员工表
 * @author: rainboz
 * @create: 2019-08-26 14:24
 **/
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;

    //部门表的外键约束
    private Department dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", dept=" + dept +
                '}';
    }
}
