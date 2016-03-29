package com.kim.designpattern.adapter;

import java.util.Map;

/**
 * Created by kim on 16-3-29.
 */
public class Adapter extends Two implements OneI {

    private Map<String, Object> baseMap = super.getBaseInfo();
    private Map<String, Object> officeMap = super.getOfficeInfo();

    @Override
    public String getName() {
        return (String) baseMap.get("name");
    }

    @Override
    public String getSex() {
        return (String) baseMap.get("sex");
    }

    @Override
    public String getNum() {
        return (String) officeMap.get("num");
    }
}
