package com.meng.spring.dao;

import com.meng.spring.pojo.HdCook;
import com.meng.spring.pojo.HdCookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HdCookMapper {
    int countByExample(HdCookExample example);

    int deleteByExample(HdCookExample example);

    int deleteByPrimaryKey(Integer cookId);

    int insert(HdCook record);

    int insertSelective(HdCook record);

    List<HdCook> selectByExample(HdCookExample example);

    HdCook selectByPrimaryKey(Integer cookId);

    int updateByExampleSelective(@Param("record") HdCook record, @Param("example") HdCookExample example);

    int updateByExample(@Param("record") HdCook record, @Param("example") HdCookExample example);

    int updateByPrimaryKeySelective(HdCook record);

    int updateByPrimaryKey(HdCook record);
}