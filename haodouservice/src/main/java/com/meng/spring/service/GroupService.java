package com.meng.spring.service;


//分组

import com.meng.spring.pojo.HdGroup;

import java.util.List;

public interface GroupService {
    void addGroup(HdGroup hdGroup);
    void deleteGroup(Integer id);
    void editGroup(HdGroup hdGroup);
    List<HdGroup> findByType(String type);
    List<HdGroup> findAllName();


}
