package com.wxy.dao;

import com.wxy.entity.News;

import java.util.List;

public interface NewsDao {
    //首页公告
    List<News> findById();

    //更多
    List<News> findAll();


}