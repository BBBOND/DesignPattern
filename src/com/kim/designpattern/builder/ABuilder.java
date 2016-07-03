package com.kim.designpattern.builder;

import java.util.ArrayList;

/**
 * 具体建造者
 */
public class ABuilder extends Builder {

    private A a = new A();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        a.setSequence(sequence);
    }

    @Override
    public Type getType() {
        return this.a;
    }
}
