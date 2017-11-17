package com.meng.spring.service.impl;

import com.meng.spring.dao.HdUserMapper;
import com.meng.spring.pojo.HdUser;
import com.meng.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private HdUserMapper mapper;
    @Override
public void addUser(HdUser hdUser) {
    mapper.insert(hdUser);
}
}
