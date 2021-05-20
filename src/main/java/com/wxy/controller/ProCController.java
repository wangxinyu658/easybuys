package com.wxy.controller;

import com.wxy.service.proc.ProCService;
import com.wxy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("proc")
public class ProCController {
    @Autowired
    private ProCService procService;
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping("/findType")
    public RespBean findType(){
        List<Object> type = procService.findType();
        return RespBean.success("成功",type);
    }

}
