package com.wxy.controller;

import com.wxy.entity.User;
import com.wxy.service.user.UserService;
import com.wxy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    //查
    @RequestMapping(value = "login")
    public RespBean login(@RequestParam(name = "name") String name,
                          @RequestParam(name = "pwd") String pwd) {
        User user = userService.login(name, pwd);
        if (user != null) {
            return RespBean.success("成功", user);
        } else {
            return RespBean.error("失败");
        }
    }
}






