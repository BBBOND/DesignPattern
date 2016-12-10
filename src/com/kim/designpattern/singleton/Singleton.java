package com.kim.designpattern.singleton;

/**
 * 双重锁模式
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void say() {
        System.out.println("This is Singleton " + singleton.hashCode());
    }
}
