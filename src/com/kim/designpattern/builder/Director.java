package com.kim.designpattern.builder;

import java.util.ArrayList;

/**
 * 指导者
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private ABuilder aBuilder = new ABuilder();
    private BBuilder bBuilder = new BBuilder();

    public A getA() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("end");
        this.aBuilder.setSequence(this.sequence);
        return (A) this.aBuilder.getType();
    }

    public B getB() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("doing");
        this.sequence.add("end");
        this.bBuilder.setSequence(this.sequence);
        return (B) this.bBuilder.getType();
    }
}
