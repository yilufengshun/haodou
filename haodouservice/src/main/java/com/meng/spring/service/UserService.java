package com.meng.spring.service;

import com.meng.spring.pojo.HdUser;

public interface UserService {
    //用户服务
    HdUser regist(HdUser hdUser);
    HdUser login(String name,String password);
    HdUser editUserById(HdUser hdUser);

}
