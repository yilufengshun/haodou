package com.meng.spring.service.impl;

import com.github.pagehelper.PageInfo;
import com.meng.spring.dao.HdCookMapper;
import com.meng.spring.pojo.HdCook;
import com.meng.spring.service.CookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CookServiceImpl implements CookService {
    @Autowired
    HdCookMapper hdCookMapper;

    @Override
    public HdCook addCook(HdCook hdCook) {
        return null;
    }

    @Override
    public HdCook editCook(HdCook hdCook) {
        return null;
    }

    @Override
    public int deleteCook(Integer cookid) {
        return 0;
    }

    @Override
    public PageInfo<HdCook> findByUser(Integer userid, Integer pageNum) {
        return null;
    }

    @Override
    public PageInfo<HdCook> findByOption(String name, Integer pageNum) {
        return null;
    }

    @Override
    public PageInfo<HdCook> findByTime(String time, Integer pageNum) {
        return null;
    }
}
