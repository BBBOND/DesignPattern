package com.kim.designpattern.builder;

import java.util.ArrayList;

/**
 * 抽象建造者
 */
public abstract class Builder {
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract Type getType();
}
