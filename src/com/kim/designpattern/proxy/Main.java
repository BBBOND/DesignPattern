package com.kim.designpattern.proxy;

/**
 * 代理模式
 * Created by kim on 16-3-27.
 */
public class Main {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new One());
        proxy.get();
        proxy.post();
    }
}
