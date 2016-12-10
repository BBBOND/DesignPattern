package com.kim.designpattern.template_method;

/**
 * Created by kim on 16-3-29.
 */
public class Main {
    public static void main(String[] args) {
        One one = new One();
        one.setProcess(true);
        one.run();

        Two two = new Two();
        two.setProcess(false);
        two.run();
    }
}
