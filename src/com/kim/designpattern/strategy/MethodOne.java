package com.kim.designpattern.strategy;

/**
 * 具体策略角色
 */
public class MethodOne implements IStrategy {
    @Override
    public void operate() {
        System.out.println("This is Method TypeOne doing!");
    }
}
