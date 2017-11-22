package com.meng.spring.service;

import com.github.pagehelper.PageInfo;
import com.meng.spring.pojo.HdUser;

public interface UserService {
    void addUser(HdUser hdUser);
    HdUser selectUser(String phone);
    PageInfo<HdUser> findAll(Integer page, Integer rows, String username);
    void edit(HdUser hdUser);
    void delete(Integer id);
}
