package com.meng.spring.dao;

import com.meng.spring.pojo.HdAlbumInfo;
import com.meng.spring.pojo.HdAlbumInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HdAlbumInfoMapper {
    int countByExample(HdAlbumInfoExample example);

    int deleteByExample(HdAlbumInfoExample example);

    int deleteByPrimaryKey(Integer albuminfoId);

    int insert(HdAlbumInfo record);

    int insertSelective(HdAlbumInfo record);

    List<HdAlbumInfo> selectByExample(HdAlbumInfoExample example);

    HdAlbumInfo selectByPrimaryKey(Integer albuminfoId);

    int updateByExampleSelective(@Param("record") HdAlbumInfo record, @Param("example") HdAlbumInfoExample example);

    int updateByExample(@Param("record") HdAlbumInfo record, @Param("example") HdAlbumInfoExample example);

    int updateByPrimaryKeySelective(HdAlbumInfo record);

    int updateByPrimaryKey(HdAlbumInfo record);
}