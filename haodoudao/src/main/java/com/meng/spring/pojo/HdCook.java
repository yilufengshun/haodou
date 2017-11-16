package com.meng.spring.pojo;

import java.util.Date;

public class HdCook {
    private Integer cookId;

    private String cookName;

    private String cookPic;

    private String cookIntro;

    private Date readyTime;

    private Date makeTime;

    private String mealsnum;

    private String cookstep;

    private String artifice;

    private String cookLabel;

    private Integer userId;

    public Integer getCookId() {
        return cookId;
    }

    public void setCookId(Integer cookId) {
        this.cookId = cookId;
    }

    public String getCookName() {
        return cookName;
    }

    public void setCookName(String cookName) {
        this.cookName = cookName;
    }

    public String getCookPic() {
        return cookPic;
    }

    public void setCookPic(String cookPic) {
        this.cookPic = cookPic;
    }

    public String getCookIntro() {
        return cookIntro;
    }

    public void setCookIntro(String cookIntro) {
        this.cookIntro = cookIntro;
    }

    public Date getReadyTime() {
        return readyTime;
    }

    public void setReadyTime(Date readyTime) {
        this.readyTime = readyTime;
    }

    public Date getMakeTime() {
        return makeTime;
    }

    public void setMakeTime(Date makeTime) {
        this.makeTime = makeTime;
    }

    public String getMealsnum() {
        return mealsnum;
    }

    public void setMealsnum(String mealsnum) {
        this.mealsnum = mealsnum;
    }

    public String getCookstep() {
        return cookstep;
    }

    public void setCookstep(String cookstep) {
        this.cookstep = cookstep;
    }

    public String getArtifice() {
        return artifice;
    }

    public void setArtifice(String artifice) {
        this.artifice = artifice;
    }

    public String getCookLabel() {
        return cookLabel;
    }

    public void setCookLabel(String cookLabel) {
        this.cookLabel = cookLabel;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}