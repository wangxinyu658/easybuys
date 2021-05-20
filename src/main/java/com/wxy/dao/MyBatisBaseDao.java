package com.wxy.dao;

import com.wxy.entity.User;

import java.io.Serializable;

public interface MyBatisBaseDao<Model, PK extends Serializable> {
    int deleteById(User id);

    int insert(User name);

    User selectById(User id);

    int updateById(User id);
}