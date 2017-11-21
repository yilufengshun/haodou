package com.meng.spring.service;

import com.meng.spring.pojo.HdUser;
import com.meng.spring.pojo.HdUserExample;

import java.util.List;

public interface UserService {
    void addUser(HdUser hdUser);
    HdUser selectUser(String phone);
    List<HdUser> findAll(Integer page, Integer rows,String username);
    void edit(HdUser hdUser);
    void delete(Integer id);
}
