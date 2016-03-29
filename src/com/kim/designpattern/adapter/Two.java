package com.kim.designpattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kim on 16-3-29.
 */
public class Two implements TwoI {
    @Override
    public Map<String, Object> getBaseInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Two's name!");
        map.put("sex", "Two's sex!");
        return map;
    }

    @Override
    public Map<String, Object> getOfficeInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("num", "Two's num!");
        return map;
    }
}
