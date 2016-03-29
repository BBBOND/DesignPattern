package com.kim.designpattern.singleton;

/**
 * 单例模式
 * Created by kim on 16-3-27.
 */
public class Main {
    public static void main(String[] args) {
        Single single = Single.getInstance();
        single.say();
        single = Single.getInstance();
        single.say();
    }
}
