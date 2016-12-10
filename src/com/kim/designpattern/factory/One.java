package com.kim.designpattern.factory;

/**
 * 具体产品角色
 */
public class One implements Type {
    @Override
    public void doFirst() {
        System.out.println("MethodOne do First!");
    }

    @Override
    public void doSecond() {
        System.out.println("MethodOne do Second!");
    }
}
