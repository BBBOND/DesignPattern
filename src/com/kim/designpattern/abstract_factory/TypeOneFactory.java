package com.kim.designpattern.abstract_factory;

/**
 * Created by kim on 16-3-27.
 */
public class TypeOneFactory extends AbstractFactory {

    @Override
    public Type createOne() {
        return super.create(OneTypeOne.class);
    }

    @Override
    public Type createTwo() {
        return super.create(TwoTypeOne.class);
    }
}
