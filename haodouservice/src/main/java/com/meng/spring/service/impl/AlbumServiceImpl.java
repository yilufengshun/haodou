package com.meng.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meng.spring.dao.HdAlbumInfoMapper;
import com.meng.spring.dao.HdAlbumMapper;
import com.meng.spring.pojo.*;
import com.meng.spring.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private HdAlbumMapper hdAlbumMapper;
    @Autowired
    private HdAlbumInfoMapper hdAlbumInfoMapper;
    @Override
    public void addAlbum(HdAlbum hdAlbum) {
    hdAlbumMapper.insert(hdAlbum);
    }

    @Override
    public void addAlbumInfo(HdAlbumInfo hdAlbumInfo) {
        hdAlbumInfoMapper.insert(hdAlbumInfo);
    }

    @Override
    public void deleteAlbumInfo(Integer infoid) {
        hdAlbumInfoMapper.deleteByPrimaryKey(infoid);
    }

    @Override
    public void deleteAlbum(Integer id) {
    hdAlbumMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void editAlbum(HdAlbum hdAlbum) {
    hdAlbumMapper.updateByPrimaryKey(hdAlbum);
    }

    @Override
    public PageInfo<HdAlbum> findByUser(Integer userid, Integer pageNum) {

        PageHelper.startPage(pageNum);
        HdAlbumExample ex=new HdAlbumExample();
        ex.createCriteria().andUserIdEqualTo(userid);
        List<HdAlbum> hdAlbums = hdAlbumMapper.selectByExample(ex);
        PageInfo<HdAlbum> page=new PageInfo<>(hdAlbums,5);
        return page;

    }

    @Override
    public PageInfo<HdAlbumInfo> findByAlbum(Integer albumid, Integer pageNum) {
        return null;
    }

    @Override
    public PageInfo<HdAlbum> findByName(String name, Integer pageNum) {
        return null;
    }
}
