package com.kim.designpattern.proxy;

/**
 * Created by kim on 16-3-27.
 */
public class One implements Type {

    @Override
    public void get() {
        System.out.println("One's get!");
    }

    @Override
    public void post() {
        System.out.println("One's post!");
    }
}
