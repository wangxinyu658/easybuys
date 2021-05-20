package com.wxy.service.news;

import com.wxy.entity.News;

import java.util.List;

public interface NewsService {

    List<News> findById();

    List<News> findAll(Integer pageNum,Integer pageSize);


}
