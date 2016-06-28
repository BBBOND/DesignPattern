package com.kim.designpattern.factory.static_factory;

import com.kim.designpattern.factory.One;
import com.kim.designpattern.factory.Two;
import com.kim.designpattern.factory.Type;

/**
 * 简单工厂模式/静态工厂模式
 */
public class Main {

    public static void main(String[] args) {
        Type one = Factory.create(One.class);
        one.doFirst();
        one.doSecond();
        Type two = Factory.create(Two.class);
        two.doFirst();
        two.doSecond();

//        Type type = null;
//        for (int i = 0; i < 10; i++) {
//            type = Factory.create();
//            type.doFirst();
//            type.doSecond();
//        }
//
//        one = Factory.lazyCreate(TypeOne.class);
//        one.doFirst();
//        two = Factory.lazyCreate(TypeTwo.class);
//        two.doSecond();
    }
}
