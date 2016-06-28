package com.kim.designpattern.factory.factory_method;

import com.kim.designpattern.factory.Two;
import com.kim.designpattern.factory.Type;

/**
 * 具体工厂角色
 */
public class TwoFactory implements Factory{

    @Override
    public Type create() {
        return new Two();
    }
}
