package com.kim.designpattern.factory.factory_method;

import com.kim.designpattern.factory.One;
import com.kim.designpattern.factory.Type;

/**
 * 具体工厂角色
 */
public class OneFactory implements Factory{

    @Override
    public Type create() {
        return new One();
    }
}
