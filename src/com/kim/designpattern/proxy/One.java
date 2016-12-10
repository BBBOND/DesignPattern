package com.kim.designpattern.proxy;

/**
 * 真实角色
 */
public class One implements Type {

    @Override
    public void get() {
        System.out.println("MethodOne's get!");
    }

    @Override
    public void post() {
        System.out.println("MethodOne's post!");
    }
}
