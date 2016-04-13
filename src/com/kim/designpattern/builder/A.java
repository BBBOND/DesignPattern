package com.kim.designpattern.builder;

/**
 * Created by kim on 16-4-13.
 */
public class A extends Type {
    @Override
    protected void start() {
        System.out.println("A start!");
    }

    @Override
    protected void doing() {
        System.out.println("A doing!");
    }

    @Override
    protected void end() {
        System.out.println("A end!");
    }
}
