package com.kim.designpattern.proxy;

/**
 * Created by kim on 16-3-27.
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
        type.get();
    }

    @Override
    public void post() {
        type.post();
    }
}
