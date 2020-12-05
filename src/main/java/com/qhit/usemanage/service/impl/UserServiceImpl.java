package com.qhit.usemanage.service.impl;

import com.qhit.usemanage.dao.UserDao;
import com.qhit.usemanage.pojo.User;
import com.qhit.usemanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String username, String password) {
        return userDao.login(username, password);
    }

    @Override
    public void add(String username, String password) {
        userDao.add(username, password);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }
}
