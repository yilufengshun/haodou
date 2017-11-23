package com.meng.spring.dto;

import java.util.HashMap;
import java.util.Map;

public class Status {

    public static Map<String,Object> getOK(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("status",200);
        return map;
    }

}
