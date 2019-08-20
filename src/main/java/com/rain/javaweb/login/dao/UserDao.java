package com.rain.javaweb.login.dao;

import com.rain.javaweb.login.beans.User;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-15 下午7:28
 */
public interface UserDao {
    public User getUserByUsernameAndPassword(String username, String password);

    public User getUserByUsername(String username);

    public void insertUser(User user);

    public void insertUser(String username,String password);
}
