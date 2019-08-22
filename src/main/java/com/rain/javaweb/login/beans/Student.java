package com.rain.javaweb.login.beans;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-22 上午11:36
 */
public class Student {
    private Integer id;
    private Integer stuId;
    private String name;
    private String sex;
    private Integer age;
    private String phone;

    public Student() {
    }

    public Student(Integer id, Integer stuId, String name, String sex, Integer age, String phone) {
        this.id = id;
        this.stuId = stuId;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuId=" + stuId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
