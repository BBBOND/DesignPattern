package com.kim.designpattern.factory;

/**
 * Created by kim on 16-3-27.
 */
public class One implements Type {
    @Override
    public void doFirst() {
        System.out.println("One do First!");
    }

    @Override
    public void doSecond() {
        System.out.println("One do Second!");
    }
}
