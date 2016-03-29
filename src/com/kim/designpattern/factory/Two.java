package com.kim.designpattern.factory;

/**
 * Created by kim on 16-3-27.
 */
public class Two implements Type {
    @Override
    public void doFirst() {
        System.out.println("Two do First!");
    }

    @Override
    public void doSecond() {
        System.out.println("Two do Second!");
    }
}