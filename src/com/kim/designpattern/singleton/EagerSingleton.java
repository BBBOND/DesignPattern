package com.kim.designpattern.singleton;

/**
 * 饿汉模式
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }

    public void say() {
        System.out.println("This is EagerSingleton " + eagerSingleton.hashCode());
    }
}
