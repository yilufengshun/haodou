package com.meng.spring.dao;

import com.meng.spring.pojo.HdIngred;
import com.meng.spring.pojo.HdIngredExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HdIngredMapper {
    int countByExample(HdIngredExample example);

    int deleteByExample(HdIngredExample example);

    int deleteByPrimaryKey(Integer ingredId);

    int insert(HdIngred record);

    int insertSelective(HdIngred record);

    List<HdIngred> selectByExample(HdIngredExample example);

    HdIngred selectByPrimaryKey(Integer ingredId);

    int updateByExampleSelective(@Param("record") HdIngred record, @Param("example") HdIngredExample example);

    int updateByExample(@Param("record") HdIngred record, @Param("example") HdIngredExample example);

    int updateByPrimaryKeySelective(HdIngred record);

    int updateByPrimaryKey(HdIngred record);
}