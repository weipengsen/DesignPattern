package com.weips.designpattern.proxy;

/**
 * 代理类，持有对真实主题类的引用，在其所实现的接口方法中调用真实主题类的方法。
 */
public class ProxySubject implements ISubject {
    private RealSubject mSubject;

    public ProxySubject(RealSubject realSubject) {
        mSubject = realSubject;
    }

    @Override
    public void operate() {
        mSubject.operate();
    }
}
