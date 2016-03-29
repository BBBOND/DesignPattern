package com.kim.designpattern.strategy;

/**
 * 策略模式
 * Created by kim on 16-3-27.
 */
public class Main {
    public static void main(String[] args) {
        Context context;

        context = new Context(new One());
        context.operate();

        context = new Context(new Two());
        context.operate();
    }
}
