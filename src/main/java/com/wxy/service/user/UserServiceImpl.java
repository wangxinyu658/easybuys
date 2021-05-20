package com.wxy.service.user;

import com.wxy.dao.UserDao;
import com.wxy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public User login(String name, String pwd) {

        return userDao.login(name, pwd);
    }

    @Override
    public User register(User user) {
        return userDao.register(user);
    }
}
