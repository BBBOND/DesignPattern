package com.kim.designpattern.strategy;

/**
 * 策略模式
 */
public class Main {
    public static void main(String[] args) {
        Context context;

        context = new Context(new MethodOne());
        context.operate();

        context = new Context(new MethodTwo());
        context.operate();
    }
}
