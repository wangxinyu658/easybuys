package com.wxy.controller;
import com.wxy.entity.Pro;
import com.wxy.service.pro.ProService;
import com.wxy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pro")
public class ProController {
    @Autowired
    public ProService proService;

    @RequestMapping("/findById")
    public RespBean findById(@RequestParam("id")Integer id){
       Pro product = proService.fingById(id);
       return RespBean.success("成功",product);
    }
    @GetMapping("/findProAndProC")
    public RespBean findProAndProC(){
        List<Object> list = proService.findAll();
        return RespBean.success("成功",list);
    }
}
