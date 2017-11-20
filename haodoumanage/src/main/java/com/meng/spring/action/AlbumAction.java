package com.meng.spring.action;


import com.github.pagehelper.PageInfo;
import com.meng.spring.pojo.HdAlbum;
import com.meng.spring.pojo.HdAlbumInfo;
import com.meng.spring.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("album")
public class AlbumAction {

    @Autowired
    private AlbumService albumService;

    @RequestMapping("add")
    public String add(HdAlbum hdAlbum){
        albumService.addAlbum(hdAlbum);
        return "";
    }
    @RequestMapping("delete")
    public String delete(Integer id){
        albumService.deleteAlbum(id);
        return "";
    }
    @RequestMapping("deleteinfo")
    public String deleteinfo(Integer id){
        albumService.deleteAlbumInfo(id);
        return "";
    }
    @RequestMapping("addinfo")
    public String addinfo(HdAlbumInfo hdAlbumInfo){
        albumService.addAlbumInfo(hdAlbumInfo);
        return "";
    }
    @RequestMapping("edit")
    public String edit(HdAlbum hdAlbum){
        albumService.editAlbum(hdAlbum);
        return "";
    }
    @RequestMapping("findbyalbum")
    public String addinfo(Integer id,Integer pageNum){
        PageInfo<HdAlbumInfo> byAlbum = albumService.findByAlbum(id, pageNum);
        return "";
    }
    @RequestMapping("findbyalbum")
    public String findbyalbum(Integer id,Integer pageNum){
        PageInfo<HdAlbumInfo> byAlbum = albumService.findByAlbum(id, pageNum);
        return "";
    }
    @RequestMapping("findbyname")
    public String findbyname(String name,Integer pageNum){
        PageInfo<HdAlbum> byAlbum = albumService.findByName(name, pageNum);
        return "";
    }
    @RequestMapping("findbyname")
    public String findbyuser(Integer userid,Integer pageNum){
        PageInfo<HdAlbum> byAlbum = albumService.findByUser(userid, pageNum);
        return "";
    }


}
