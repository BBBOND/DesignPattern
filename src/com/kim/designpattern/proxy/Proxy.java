package com.kim.designpattern.proxy;

/**
 * 代理角色
 */
public class Proxy implements Type {

    private Type type;

    public Proxy() {
        type = new One();
    }

    public Proxy(Type type) {
        this.type = type;
    }

    @Override
    public void get() {
        System.out.println("Proxy doing!");
        type.get();
    }

    @Override
    public void post() {
        System.out.println("Proxy doing!");
        type.post();
    }
}
