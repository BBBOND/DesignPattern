package com.kim.designpattern.builder;

/**
 * 产品角色
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
