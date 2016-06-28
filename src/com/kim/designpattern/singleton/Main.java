package com.kim.designpattern.singleton;

/**
 * 单例模式
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.say();
        singleton = Singleton.getInstance();
        singleton.say();

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.say();
        eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.say();

        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.say();
        lazySingleton = LazySingleton.getInstance();
        lazySingleton.say();
    }
}
