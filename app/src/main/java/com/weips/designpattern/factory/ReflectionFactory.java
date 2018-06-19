package com.weips.designpattern.factory;

public abstract class ReflectionFactory {
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
