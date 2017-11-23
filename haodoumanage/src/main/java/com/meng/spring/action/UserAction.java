package com.meng.spring.action;

import java.util.Map;
import com.github.pagehelper.PageInfo;
import com.meng.spring.dto.DataDto;
import com.meng.spring.dto.Status;
import com.meng.spring.pojo.HdUser;
import com.meng.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("user")
public class UserAction {
    @Autowired
    private UserService userService;

    @RequestMapping("add")
    @ResponseBody
    public Map add(HdUser hdUser){
        userService.addUser(hdUser);
        return Status.getOK();
    }

    @RequestMapping("list")
    @ResponseBody
    public DataDto list(String username, Integer page, Integer rows){
        PageInfo<HdUser> all = userService.findAll(page, rows, username);
        DataDto dto=new DataDto();
        dto.setPage(page);
        dto.setRows(all.getList());
        return dto;
    }
    @RequestMapping("edit")
    @ResponseBody
    public Map edit(HdUser hdUser){
        userService.edit(hdUser);
        return Status.getOK();
    }
}