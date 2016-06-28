package com.kim.designpattern.abstract_factory;

/**
 * 抽象产品角色
 */
public abstract class TypeTwo implements Type {
    @Override
    public void doFirst() {
        System.out.println("MethodTwo do First!");
    }
}
