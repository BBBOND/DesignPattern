package com.kim.designpattern.abstract_factory;

/**
 * 抽象工厂角色
 */
public abstract class AbstractFactory implements Factory {
    protected Type create(Class c) {
        Type type = null;
        try {
            type = (Type) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return type;
    }
}
