package com.kim.designpattern.builder;

import java.util.ArrayList;

public class BBuilder extends TypeBuilder {

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
