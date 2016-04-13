package com.kim.designpattern.builder;

/**
 * Created by kim on 16-4-13.
 */
public class B extends Type {
    @Override
    protected void start() {
        System.out.println("B start!");
    }

    @Override
    protected void doing() {
        System.out.println("B doing!");
    }

    @Override
    protected void end() {
        System.out.println("B end!");
    }
}
