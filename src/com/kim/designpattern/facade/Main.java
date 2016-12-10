package com.kim.designpattern.facade;

/**
 * 门面模式
 * Created by kim on 16-3-27.
 */
public class Main {

    public static void main(String[] args) {
        Two two = new Two();
        two.doIt("666", "2333", "哈哈哈");
    }
}
