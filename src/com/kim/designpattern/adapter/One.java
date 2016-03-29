package com.kim.designpattern.adapter;

public class One implements OneI {
    @Override
    public String getName() {
        return "One's name!";
    }

    @Override
    public String getSex() {
        return "One's sex!";
    }

    @Override
    public String getNum() {
        return "One's num!";
    }
}
