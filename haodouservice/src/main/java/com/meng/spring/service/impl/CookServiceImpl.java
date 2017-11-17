package com.meng.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meng.spring.dao.HdCookMapper;
import com.meng.spring.pojo.HdCook;
import com.meng.spring.pojo.HdCookExample;
import com.meng.spring.service.CookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookServiceImpl implements CookService {
    @Autowired
    HdCookMapper hdCookMapper;

    @Override
    public HdCook addCook(HdCook hdCook) {
        hdCookMapper.insert(hdCook);
        return hdCook;
    }

    @Override
    public HdCook editCook(HdCook hdCook) {
        hdCookMapper.updateByPrimaryKey(hdCook);

        return hdCook;
    }

    @Override
    public int deleteCook(Integer cookid) {
        return hdCookMapper.deleteByPrimaryKey(cookid);
    }

    @Override
    public PageInfo<HdCook> findByUser(Integer userid, Integer pageNum) {
        PageHelper.startPage(pageNum);
        HdCookExample ex=new HdCookExample();
        ex.createCriteria().andUserIdEqualTo(userid);

        List<HdCook> hdCooks = hdCookMapper.selectByExample(ex);
        PageInfo<HdCook> page=new PageInfo<>(hdCooks,5);
        return page;

    }

    @Override
    public PageInfo<HdCook> findByOption(String name, Integer pageNum) {
        PageHelper.startPage(pageNum);
        HdCookExample ex=new HdCookExample();
        ex.createCriteria().andCookNameLike(name);
        List<HdCook> hdCooks = hdCookMapper.selectByExample(ex);
        PageInfo<HdCook> page=new PageInfo<>(hdCooks,5);
        return page;

    }

    @Override
    public PageInfo<HdCook> findByTime(String time, Integer pageNum) {


        return null;
    }
}
