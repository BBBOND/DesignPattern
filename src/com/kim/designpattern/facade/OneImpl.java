package com.kim.designpattern.facade;

public class OneImpl implements OneI {
    @Override
    public void doFirst(String str) {
        System.out.println("doFirst " + str);
    }

    @Override
    public void doSecond(String str) {
        System.out.println("doSecond " + str);
    }

    @Override
    public void doThird(String str) {
        System.out.println("doThird " + str);
    }

    @Override
    public void doFinally() {
        System.out.println("doFinally");
    }
}
