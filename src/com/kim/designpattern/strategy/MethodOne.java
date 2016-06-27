package com.kim.designpattern.strategy;

/**
 * 方法一
 */
public class MethodOne implements IStrategy {
    @Override
    public void operate() {
        System.out.println("This is Method One doing!");
    }
}
