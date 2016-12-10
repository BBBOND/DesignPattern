package com.kim.designpattern.abstract_factory;

/**
 * 抽象产品角色
 */
public abstract class TypeOne implements Type {
    @Override
    public void doFirst() {
        System.out.println("MethodOne do First!");
    }
}
