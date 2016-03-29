package com.kim.designpattern.abstract_factory;

/**
 * Created by kim on 16-3-27.
 */
public abstract class Two implements Type {
    @Override
    public void doFirst() {
        System.out.println("Two do First!");
    }
}
