package com.qhit.usemanage.service;

import com.qhit.usemanage.pojo.User;

import java.util.List;

public interface UserService {

    User login(String username, String password);
    void add(String username, String password);
    List<User> findAll();
    void update(User user);

    User findById(Integer id);
}
