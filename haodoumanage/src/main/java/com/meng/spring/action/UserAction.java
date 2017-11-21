package com.meng.spring.action;


import com.meng.spring.dto.dataDto;
import com.meng.spring.pojo.HdUser;
import com.meng.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("user")
@ResponseBody
@Controller
public class UserAction {
    @Autowired
    UserService userService;
@RequestMapping("add")
    public Map<String, Object> add(HdUser hdUser){
        userService.addUser(hdUser);
    Map<String,Object> map=new HashMap<>();
    map.put("status",200);
        return map;
    }
    @RequestMapping("list")
    public dataDto list(Integer page, Integer rows,String username){
        List<HdUser> all = userService.findAll(page, rows);
        dataDto dto=new dataDto();
        dto.setRows(all);
        dto.setPage(page);
        return dto;
    }
    @RequestMapping("edit")
    public Map<String,Object> edit(HdUser hdUser){
        userService.edit(hdUser);
        Map<String,Object> map=new HashMap<>();
        map.put("status",200);
        return map;
    }

}
