package com.weips.designpattern.proxy;


/**
 * 定义：为其他对象提供一种代理来控制对这个对象的访问
 * 使用场景：当无法或者不想直接访问某个对象或访问某个对象存在困难时可以通过一个代理对象来间接访问，
 *          为了保证客户端使用的透明性，委托对象与代理对象需要实现相同的接口。
 *
 * 抽象主题类：主要职能为声明真实主题与代理的共同接口方法
 */

public interface ISubject {
    void operate();
}
