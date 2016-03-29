package com.kim.designpattern.facade;

/**
 * Created by kim on 16-3-27.
 */
public class Two {
    private OneI one = new OneImpl();

    public void doIt(String str1, String str2, String str3) {
        one.doFirst(str1);
        one.doSecond(str2);
        one.doThird(str3);
        one.doFinally();
    }
}
