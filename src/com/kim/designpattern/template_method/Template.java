package com.kim.designpattern.template_method;

/**
 * Created by kim on 16-3-29.
 */
public abstract class Template {
    protected abstract void start();

    protected abstract void process();

    protected abstract void stop();

    final public void run() {

        this.start();
        if (this.isProcess()) {
            this.process();
        }
        this.stop();
    }

    protected boolean isProcess() {
        return false;
    }
}
