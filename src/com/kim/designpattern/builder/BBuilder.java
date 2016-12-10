package com.kim.designpattern.builder;

import java.util.ArrayList;

/**
 * 具体建造者
 */
public class BBuilder extends Builder {

    private B b = new B();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        b.setSequence(sequence);
    }

    @Override
    public Type getType() {
        return this.b;
    }
}
