package com.kim.designpattern.abstract_factory;

/**
 * 具体工厂角色
 */
public class TypeOneFactory extends AbstractFactory {

    @Override
    public Type createOne() {
        return super.create(T1One.class);
    }

    @Override
    public Type createTwo() {
        return super.create(T1Two.class);
    }
}
