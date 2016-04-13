package com.kim.designpattern.builder;

import java.util.ArrayList;

public class ABuilder extends TypeBuilder {

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
