package com.kim.designpattern.prototype;

/**
 * Client
 * 原型模式
 */
public class Main {

    public static void main(String[] args) {
        try {
            ConcretePrototype prototype1 = new ConcretePrototype("KIM");
            ConcretePrototype prototype2 = prototype1.copy();
            System.out.println("prototype1 : " + prototype1.getName());
            System.out.println("prototype2 : " + prototype2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
