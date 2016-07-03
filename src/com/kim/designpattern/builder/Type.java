package com.kim.designpattern.builder;

import java.util.ArrayList;

/**
 * 抽象产品角色
 */
public abstract class Type {
    private ArrayList<String> sequence = new ArrayList<>();

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

    protected abstract void start();

    protected abstract void doing();

    protected abstract void end();

    final public void run() {
        for (int i = 0, n = sequence.size(); i < n; i++) {
            String actionName = sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("doing")) {
                this.doing();
            } else if (actionName.equalsIgnoreCase("end")) {
                this.end();
            }
        }
    }
}
