package com.meng.spring.action;


import com.github.pagehelper.PageInfo;
import com.meng.spring.dto.DataDto;
import com.meng.spring.dto.Status;
import com.meng.spring.pojo.HdGroup;
import com.meng.spring.pojo.HdUser;
import com.meng.spring.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("group")
@ResponseBody
public class GroupAction {
    @Autowired
    private GroupService groupService;


    @RequestMapping("add")
    public Map add(HdGroup hdGroup){

    groupService.addGroup(hdGroup);
    return Status.getOK();

    }
    @RequestMapping("list")
    public DataDto list(String grouptype, Integer page, Integer rows){
        List<HdGroup> all=null;
        if(grouptype!=null&&!grouptype.trim().equals("")) {
             all= groupService.findByType(grouptype);
        }else
        {
            all = groupService.findAllName();
        }
        DataDto dto=new DataDto();
        dto.setPage(page);
        dto.setRows(all);
        return dto;

    }

    @RequestMapping("edit")
    public Map edit(HdGroup hdGroup){
        groupService.editGroup(hdGroup);
        return Status.getOK();
    }
    @RequestMapping("delete")
    public Map delete(Integer id){
        groupService.deleteGroup(id);
        return Status.getOK();
    }

}
