package com.qhit.usemanage.dao;

import com.qhit.usemanage.pojo.User;

import java.util.List;


public interface UserDao {

    User login(String username, String password);
    void add(String username, String password);
    List<User> findAll();

    void update(User user);

    User findById(Integer id);
}
