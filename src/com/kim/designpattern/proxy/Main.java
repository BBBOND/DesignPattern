package com.kim.designpattern.proxy;

/**
 * 代理模式
 */
public class Main {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new One());
        proxy.get();
        proxy.post();
    }
}
