package com.kim.designpattern.strategy;

/**
 * Created by kim on 16-3-27.
 */
public class One implements IStrategy {
    @Override
    public void operate() {
        System.out.println("First!");
    }
}
