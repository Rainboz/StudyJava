package com.zhb.mysql;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-6 下午9:38
 **/
public class User {
    private int userId;
    private String userName;
    private int age;
    //    private char sex;
    private String sex;

    public User() {
    }

    public User(int userId, String userName, int age, String sex) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
        this.sex = sex;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

