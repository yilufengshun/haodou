package com.meng.spring.action;


import com.github.pagehelper.PageInfo;
import com.meng.spring.dto.DataDto;
import com.meng.spring.dto.Status;
import com.meng.spring.pojo.HdAlbum;

import com.meng.spring.pojo.HdAlbumInfo;
import com.meng.spring.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("album")
@ResponseBody
public class AlbumAction {
    @Autowired
    private AlbumService albumService;

    @RequestMapping("findbyname")
    public DataDto listalbum(String albumname, Integer page, Integer rows){
        PageInfo<HdAlbum> all = albumService.findByName(albumname,rows,page);
        DataDto dto=new DataDto();
        dto.setPage(page);
        dto.setRows(all.getList());
        return dto;
    }
    @RequestMapping("add")
    public Map add(HdAlbum hdAlbum)
    {
        albumService.addAlbum(hdAlbum);
        return Status.getOK();

    }
    @RequestMapping("edit")
    public Map edit(HdAlbum hdAlbum)
    {
        albumService.editAlbum(hdAlbum);
        return Status.getOK();

    }
    @RequestMapping("findinfo")
    public DataDto findinfo(Integer id, Integer page, Integer rows){
        PageInfo<HdAlbumInfo> album = albumService.findByAlbum(id, page, rows);
        DataDto dto=new DataDto();
        dto.setPage(page);
        dto.setRows(album.getList());
        return dto;
    }
    @RequestMapping("deleteinfo")
    public Map deleteinfo(Integer id){
        albumService.deleteAlbumInfo(id);
        return Status.getOK();
    }
    @RequestMapping("addinfo")
    public Map addinfo(HdAlbumInfo hdAlbumInfo){
        albumService.addAlbumInfo(hdAlbumInfo);
        return Status.getOK();
    }

}
