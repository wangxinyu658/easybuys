package com.wxy.dao;

import com.wxy.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao{

    User login(@Param("name") String name,@Param("pwd") String pwd);

    User register(User user);


}