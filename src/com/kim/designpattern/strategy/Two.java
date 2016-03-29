package com.kim.designpattern.strategy;

/**
 * Created by kim on 16-3-27.
 */
public class Two implements IStrategy {

    @Override
    public void operate() {
        System.out.println("Second!");
    }
}
