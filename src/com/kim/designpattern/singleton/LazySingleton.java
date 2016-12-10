package com.kim.designpattern.singleton;

/**
 * 懒汉模式
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }

    public void say() {
        System.out.println("This is LazySingleton " + lazySingleton.hashCode());
    }
}
