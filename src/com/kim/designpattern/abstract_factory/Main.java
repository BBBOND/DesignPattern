package com.kim.designpattern.abstract_factory;

/**
 * 抽象工厂模式
 * Created by kim on 16-3-27.
 */
public class Main {

    public static void main(String[] args) {
        Factory typeOneFactory = new TypeOneFactory();
        Factory typeTwoFactory = new TypeTwoFactory();
        Type oneTypeOne = typeOneFactory.createOne();
        Type twoTypeTwo = typeTwoFactory.createTwo();

        oneTypeOne.doFirst();
        oneTypeOne.type();
        twoTypeTwo.doFirst();
        twoTypeTwo.type();
    }
}
