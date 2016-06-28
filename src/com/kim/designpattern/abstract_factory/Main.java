package com.kim.designpattern.abstract_factory;

/**
 * 抽象工厂模式
 */
public class Main {

    public static void main(String[] args) {
        Factory typeOneFactory = new TypeOneFactory();
        Factory typeTwoFactory = new TypeTwoFactory();
        Type t1One = typeOneFactory.createOne();
        Type t2Two = typeTwoFactory.createTwo();

        t1One.doFirst();
        t1One.type();
        t2Two.doFirst();
        t2Two.type();
    }
}
