package com.meng.spring.service;


import com.github.pagehelper.PageInfo;
import com.meng.spring.pojo.HdAlbum;
import com.meng.spring.pojo.HdAlbumInfo;

//专辑
public interface AlbumService {
    void addAlbum(HdAlbum hdAlbum);
    void addAlbumInfo(HdAlbumInfo hdAlbumInfo);
    void deleteAlbumInfo(Integer infoid);
    void deleteAlbum(Integer id);
    void editAlbum(HdAlbum hdAlbum);
    PageInfo<HdAlbum> findByUser(Integer userid, Integer pageNum);
    PageInfo<HdAlbumInfo> findByAlbum(Integer albumid,Integer pageNum,Integer rows);
    PageInfo<HdAlbum> findByName(String name,Integer rows,Integer pageNum);

}
