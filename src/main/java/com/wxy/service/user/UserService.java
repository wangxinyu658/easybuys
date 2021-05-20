package com.wxy.service.user;

import com.wxy.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface UserService {
    User login(String name,String pwd);

    //注册
    User register(User user);



    }






