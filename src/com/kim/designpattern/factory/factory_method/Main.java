package com.kim.designpattern.factory.factory_method;

import com.kim.designpattern.factory.One;
import com.kim.designpattern.factory.Two;

/**
 * 工厂方法模式
 */
public class Main {
    public static void main(String[] args) {
        Factory oneFactory = new OneFactory();
        Factory twoFactory = new TwoFactory();
        One one = (One) oneFactory.create();
        one.doFirst();
        one.doSecond();
        Two two = (Two) twoFactory.create();
        two.doFirst();
        two.doSecond();
    }
}
