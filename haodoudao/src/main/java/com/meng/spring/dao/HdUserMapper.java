package com.meng.spring.dao;

import com.meng.spring.pojo.HdUser;
import com.meng.spring.pojo.HdUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HdUserMapper {
    int countByExample(HdUserExample example);

    int deleteByExample(HdUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(HdUser record);

    int insertSelective(HdUser record);

    List<HdUser> selectByExample(HdUserExample example);

    HdUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") HdUser record, @Param("example") HdUserExample example);

    int updateByExample(@Param("record") HdUser record, @Param("example") HdUserExample example);

    int updateByPrimaryKeySelective(HdUser record);

    int updateByPrimaryKey(HdUser record);
}