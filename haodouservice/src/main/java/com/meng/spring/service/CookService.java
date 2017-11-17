package com.meng.spring.service;


import com.github.pagehelper.PageInfo;
import com.meng.spring.pojo.HdCook;

//菜谱
public interface CookService {
    HdCook addCook(HdCook hdCook);
    HdCook editCook(HdCook hdCook);
    int deleteCook(Integer cookid);
    PageInfo<HdCook> findByUser(Integer userid,Integer pageNum);
    PageInfo<HdCook> findByOption(String name,Integer pageNum);
    PageInfo<HdCook> findByTime(String time,Integer pageNum);

}
