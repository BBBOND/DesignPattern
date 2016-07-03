package com.kim.designpattern.builder;

/**
 * 产品角色
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
