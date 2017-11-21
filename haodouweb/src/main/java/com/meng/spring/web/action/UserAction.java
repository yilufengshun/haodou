package com.meng.spring.web.action;

import com.meng.spring.service.RedisService;
import com.meng.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private RedisService redisService;
    @Autowired
    private UserService userService;
    @RequestMapping("/regist")
    public String regist(Model model,String phone){
        return null;
    }
}
