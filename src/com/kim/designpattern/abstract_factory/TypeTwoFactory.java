package com.kim.designpattern.abstract_factory;

/**
 * 具体工厂角色
 */
public class TypeTwoFactory extends AbstractFactory {
    @Override
    public Type createOne() {
        return super.create(T2One.class);
    }

    @Override
    public Type createTwo() {
        return super.create(T2Two.class);
    }
}
