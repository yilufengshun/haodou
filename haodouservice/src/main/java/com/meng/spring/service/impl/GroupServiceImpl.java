package com.meng.spring.service.impl;

import com.meng.spring.dao.HdGroupMapper;
import com.meng.spring.pojo.HdGroup;
import com.meng.spring.pojo.HdGroupExample;
import com.meng.spring.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    public HdGroupMapper hdGroupMapper;

    @Override
    public void addGroup(HdGroup hdGroup) {
        hdGroupMapper.insert(hdGroup);

    }

    @Override
    public void deleteGroup(Integer id) {
    hdGroupMapper.deleteByPrimaryKey(Long.valueOf(id));
    }

    @Override
    public void editGroup(HdGroup hdGroup) {
        hdGroupMapper.updateByPrimaryKeySelective(hdGroup);


    }

    @Override
    public List<HdGroup> findByType(String type) {
        HdGroupExample ex=new HdGroupExample();
        ex.createCriteria().andGroupTypeEqualTo(type);
        List<HdGroup> hdGroups = hdGroupMapper.selectByExample(ex);

        return hdGroups;
    }

    @Override
    public List<HdGroup> findAllName() {

        List<HdGroup> hdGroups = hdGroupMapper.selectByExample(new HdGroupExample());

        return hdGroups;
    }
}
