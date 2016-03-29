package com.kim.designpattern.factory;

/**
 * 工厂模式
 * Created by kim on 16-3-27.
 */
public class Main {

    public static void main(String[] args) {
        Type one = Factory.create(One.class);
        one.doFirst();
        one.doSecond();
        Type two = Factory.create(Two.class);
        two.doFirst();
        two.doSecond();

        Type type = null;
        for (int i = 0; i < 10; i++) {
            type = Factory.create();
            type.doFirst();
            type.doSecond();
        }

        one = Factory.lazyCreate(One.class);
        one.doFirst();
        two = Factory.lazyCreate(Two.class);
        two.doSecond();
    }
}
