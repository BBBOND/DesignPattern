package com.kim.designpattern.builder;

import java.util.ArrayList;

public abstract class TypeBuilder {
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract Type getType();
}
