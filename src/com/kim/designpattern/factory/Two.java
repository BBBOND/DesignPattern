package com.kim.designpattern.factory;

/**
 * 具体产品角色
 */
public class Two implements Type {
    @Override
    public void doFirst() {
        System.out.println("MethodTwo do First!");
    }

    @Override
    public void doSecond() {
        System.out.println("MethodTwo do Second!");
    }
}
