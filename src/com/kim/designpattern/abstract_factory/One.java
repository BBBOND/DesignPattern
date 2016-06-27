package com.kim.designpattern.abstract_factory;

/**
 * Created by kim on 16-3-27.
 */
public abstract class One implements Type {
    @Override
    public void doFirst() {
        System.out.println("MethodOne do First!");
    }
}
