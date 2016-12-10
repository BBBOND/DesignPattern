package com.kim.designpattern.adapter;

/**
 * 客户角色
 */
public class One implements OneI {
    @Override
    public String getName() {
        return "MethodOne's name!";
    }

    @Override
    public String getSex() {
        return "MethodOne's sex!";
    }

    @Override
    public String getNum() {
        return "MethodOne's num!";
    }
}
