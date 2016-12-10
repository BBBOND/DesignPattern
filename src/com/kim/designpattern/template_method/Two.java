package com.kim.designpattern.template_method;

/**
 * Created by kim on 16-3-29.
 */
public class Two extends Template {

    private boolean isProcess = false;

    @Override
    protected void start() {
        System.out.println("MethodTwo start....");
    }

    @Override
    protected void process() {
        System.out.println("MethodTwo process...");
    }

    @Override
    protected void stop() {
        System.out.println("MethodTwo stop...");
    }

    public void setProcess(boolean isProcess) {
        this.isProcess = isProcess;
    }

    @Override
    protected boolean isProcess() {
        return this.isProcess;
    }

}
