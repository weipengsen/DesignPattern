package com.weips.designpattern.factory;

public abstract class ReflectFactory<T extends Product> {
    public abstract T createProduct() throws ClassNotFoundException;
}
