package com.weips.designpattern.factory;

import android.util.Log;

/**
 * 具体产品，为实现了抽象产品的某个具体产品的对象
 */
public class ConcreteProductA extends Product {
    @Override
    public void method() {
        Log.e("ConcreteProductA","method");
    }
}
