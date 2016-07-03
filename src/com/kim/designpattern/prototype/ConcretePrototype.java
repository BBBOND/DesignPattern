package com.kim.designpattern.prototype;

/**
 * 具体原型对象
 */
public class ConcretePrototype implements Prototype {

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ConcretePrototype copy() throws CloneNotSupportedException {
//        浅拷贝
//        return this;
        //深拷贝
        return (ConcretePrototype) this.clone();
    }
}
