package com.meng.spring.dao;

import com.meng.spring.pojo.HdTopic;
import com.meng.spring.pojo.HdTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HdTopicMapper {
    int countByExample(HdTopicExample example);

    int deleteByExample(HdTopicExample example);

    int deleteByPrimaryKey(Integer topicId);

    int insert(HdTopic record);

    int insertSelective(HdTopic record);

    List<HdTopic> selectByExample(HdTopicExample example);

    HdTopic selectByPrimaryKey(Integer topicId);

    int updateByExampleSelective(@Param("record") HdTopic record, @Param("example") HdTopicExample example);

    int updateByExample(@Param("record") HdTopic record, @Param("example") HdTopicExample example);

    int updateByPrimaryKeySelective(HdTopic record);

    int updateByPrimaryKey(HdTopic record);
}