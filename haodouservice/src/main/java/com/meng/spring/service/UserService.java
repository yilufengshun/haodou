package com.meng.spring.service;

import com.meng.spring.pojo.HdUser;
import com.meng.spring.pojo.HdUserExample;

public interface UserService {
    void addUser(HdUser hdUser);
    HdUser selectUser(String phone);

}
