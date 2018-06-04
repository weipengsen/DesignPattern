package com.weips.designpattern.proxy;

import android.util.Log;

/**
 * 真实主题类：也被称为被委托类或者被代理类，定义了具体的执行方法。
 */
public class RealSubject implements ISubject {
    @Override
    public void operate() {
        Log.e("RealSubject","operate");
    }
}
