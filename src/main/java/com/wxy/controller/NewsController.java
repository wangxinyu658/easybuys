package com.wxy.controller;
import com.wxy.entity.News;
import com.wxy.service.news.NewsService;
import com.wxy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    //查五条
    @CrossOrigin(origins = "*", maxAge = 3600)
    @GetMapping("/")
    public RespBean fingById() {
        List<News> newslist = newsService.findById();
        return RespBean.success("成功", newslist);
    }

    //查全部并分页
    @CrossOrigin(origins = "*", maxAge = 3600)
    @GetMapping("/findAll")
    public RespBean findAll(@RequestParam(value = "pageNum",defaultValue = "1",required=false
    )Integer pageNum,@RequestParam(defaultValue = "10",required = false)Integer pageSize) {
        List<News> alllist = newsService.findAll(pageNum,pageSize);
        return RespBean.success("成功", alllist);
    }






}
