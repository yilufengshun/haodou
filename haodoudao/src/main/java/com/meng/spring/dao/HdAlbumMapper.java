package com.meng.spring.dao;

import com.meng.spring.pojo.HdAlbum;
import com.meng.spring.pojo.HdAlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HdAlbumMapper {
    int countByExample(HdAlbumExample example);

    int deleteByExample(HdAlbumExample example);

    int deleteByPrimaryKey(Integer albumId);

    int insert(HdAlbum record);

    int insertSelective(HdAlbum record);

    List<HdAlbum> selectByExample(HdAlbumExample example);

    HdAlbum selectByPrimaryKey(Integer albumId);

    int updateByExampleSelective(@Param("record") HdAlbum record, @Param("example") HdAlbumExample example);

    int updateByExample(@Param("record") HdAlbum record, @Param("example") HdAlbumExample example);

    int updateByPrimaryKeySelective(HdAlbum record);

    int updateByPrimaryKey(HdAlbum record);
}