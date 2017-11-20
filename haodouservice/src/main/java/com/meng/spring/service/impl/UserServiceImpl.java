package com.meng.spring.service.impl;

import com.meng.spring.dao.HdUserMapper;
import com.meng.spring.pojo.HdUser;
import com.meng.spring.pojo.HdUserExample;
import com.meng.spring.service.RedisService;
import com.meng.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private HdUserMapper mapper;
    @Autowired
    private RedisService redisService;;
    @Override
    public void addUser(HdUser hdUser) {
        mapper.insert(hdUser);
    }

    @Override
    public HdUser selectUser(String phone) {
        HdUserExample ex=new HdUserExample();
        ex.createCriteria().andUserPhoneEqualTo(phone);
        List<HdUser> hdUsers = mapper.selectByExample(ex);
        return hdUsers.get(0);
    }
}
