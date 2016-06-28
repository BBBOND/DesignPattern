package com.kim.designpattern.strategy;

/**
 * 具体策略角色
 */
public class MethodTwo implements IStrategy {

    @Override
    public void operate() {
        System.out.println("This is Method TypeTwo doing!");
    }
}
