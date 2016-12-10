package com.kim.designpattern.builder;

import java.util.ArrayList;

/**
 * 建造者模式
 * Created by kim on 16-4-13.
 */
public class Main {
    public static void main(String[] args) {
        A a = new A();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("Doing");
        sequence.add("end");
        a.setSequence(sequence);
        a.run();

        BBuilder bBuilder = new BBuilder();
        bBuilder.setSequence(sequence);
        B b = (B) bBuilder.getType();
        b.run();

        Director director = new Director();
        director.getA().run();
        director.getB().run();
    }
}
