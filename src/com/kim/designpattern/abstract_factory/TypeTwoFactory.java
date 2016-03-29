package com.kim.designpattern.abstract_factory;

/**
 * Created by kim on 16-3-27.
 */
public class TypeTwoFactory extends AbstractFactory {
    @Override
    public Type createOne() {
        return super.create(OneTypeTwo.class);
    }

    @Override
    public Type createTwo() {
        return super.create(TwoTypeTwo.class);
    }
}
