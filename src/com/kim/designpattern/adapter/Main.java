package com.kim.designpattern.adapter;

/**
 * 适配器模式
 */
public class Main {

    public static void main(String[] args) {
        One one = new One();
        System.out.println("Name=" + one.getName());
        System.out.println("Sex=" + one.getSex());
        System.out.println("Num=" + one.getNum());
        System.out.println("-----------");
        Two two = new Two();
        System.out.println("Name=" + two.getBaseInfo().get("name"));
        System.out.println("Sex=" + two.getBaseInfo().get("sex"));
        System.out.println("Num=" + two.getOfficeInfo().get("num"));
        System.out.println("-----------");
        Adapter adapter = new Adapter();
        System.out.println("Name=" + adapter.getName());
        System.out.println("Sex=" + adapter.getSex());
        System.out.println("Num=" + adapter.getNum());
    }
}
