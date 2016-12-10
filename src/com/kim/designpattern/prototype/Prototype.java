package com.kim.designpattern.prototype;

/**
 * 抽象原型角色
 */
public interface Prototype {
    Prototype copy() throws CloneNotSupportedException;

}
