package com.kim.designpattern.proxy;

/**
 * Created by kim on 16-3-27.
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
