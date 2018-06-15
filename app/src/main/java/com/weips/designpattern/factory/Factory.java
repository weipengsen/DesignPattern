package com.weips.designpattern.factory;


/**
 * 工厂方法模式，是创建型设计模式之一
 *
 * 定义：定义一个用于创建对象的接口，让子类决定实例化哪个类。
 *
 * 使用场景：在任何需要生成复杂对象的地方，都可以使用工厂方法模式。
 *
 * 生产product不由参数来决定，也不用去new，而是由创建相应的工厂来实现。
 * 但是创建工厂时还是由参数来决定，可以使用反射，减少具体的工厂类。
 *
 * 抽象工厂类，工厂方法模式的核心
 */
public abstract class Factory {
    public abstract Product createProduct();
}
