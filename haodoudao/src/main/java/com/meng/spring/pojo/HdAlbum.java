package com.meng.spring.pojo;


//用户专辑
public class HdAlbum {

    private Integer albumId;

    private String albumIntro;

    private String albumTap;

    private Integer userId;

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getAlbumIntro() {
        return albumIntro;
    }

    public void setAlbumIntro(String albumIntro) {
        this.albumIntro = albumIntro;
    }

    public String getAlbumTap() {
        return albumTap;
    }

    public void setAlbumTap(String albumTap) {
        this.albumTap = albumTap;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}