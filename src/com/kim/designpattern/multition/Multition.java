package com.kim.designpattern.multition;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kim on 16-3-27.
 */
public class Multition {
    private static int maxNum = 2;
    private static ArrayList multition = new ArrayList(maxNum);
    private static ArrayList multitionInfo = new ArrayList(maxNum);

    private static int current = 0;

    static {
        for (int i = 0; i < maxNum; i++) {
            multition.add(new Multition("Multition : " + i));
        }
    }

    private Multition() {
    }

    private Multition(String info) {
        multitionInfo.add(info);
    }

    public static Multition getInstance() {
        Random random = new Random();
        current = random.nextInt(maxNum);
        return (Multition) multition.get(current);
    }

    public static Multition getInstance(int index) {
        current = index;
        return (Multition) multition.get(index);
    }

    public void say() {
        System.out.println(multitionInfo.get(current));
    }
}
