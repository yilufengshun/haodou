package com.meng.spring.dao;

import com.meng.spring.pojo.HdGroup;
import com.meng.spring.pojo.HdGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HdGroupMapper {
    int countByExample(HdGroupExample example);

    int deleteByExample(HdGroupExample example);

    int deleteByPrimaryKey(Long groupId);

    int insert(HdGroup record);

    int insertSelective(HdGroup record);

    List<HdGroup> selectByExample(HdGroupExample example);

    HdGroup selectByPrimaryKey(Long groupId);

    int updateByExampleSelective(@Param("record") HdGroup record, @Param("example") HdGroupExample example);

    int updateByExample(@Param("record") HdGroup record, @Param("example") HdGroupExample example);

    int updateByPrimaryKeySelective(HdGroup record);

    int updateByPrimaryKey(HdGroup record);
}