package com.weips.designpattern.factory;

/**
 * 具体工厂，实现了具体的业务逻辑
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
