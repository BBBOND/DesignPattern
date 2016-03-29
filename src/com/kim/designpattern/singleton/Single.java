package com.kim.designpattern.singleton;

/**
 * Created by kim on 16-3-27.
 */
public class Single {
    private static Single single = null;

    private Single() {
    }

    public static Single getInstance() {
        if (single == null) {
            single = new Single();
        }
        return single;
    }

    public void say() {
        System.out.println("This is Single " + single.hashCode());
    }
}
