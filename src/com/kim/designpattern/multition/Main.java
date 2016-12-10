package com.kim.designpattern.multition;

/**
 * 多例模式
 * Created by kim on 16-3-27.
 */
public class Main {

    public static void main(String[] args) {
        Multition multition = null;
        for (int i = 0; i < 10; i++) {
            multition = Multition.getInstance();
            multition.say();
        }
        System.out.println("-------------");
        multition = Multition.getInstance(0);
        multition.say();
        multition = Multition.getInstance(1);
        multition.say();
    }
}
