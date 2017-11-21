package com.meng.spring.dto;

import java.util.List;

public class dataDto {
   private Integer page;
   private List rows;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
