package com.wxy.service.news;

import com.github.pagehelper.PageHelper;
import com.wxy.dao.NewsDao;
import com.wxy.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> findById() {
        return newsDao.findById();
    }

    @Override
    public List<News> findAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return newsDao.findAll();
    }
}
