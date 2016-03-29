package com.kim.designpattern.strategy;

/**
 * 用于调用方法
 * Created by kim on 16-3-27.
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        strategy.operate();
    }
}
