package com.weips.designpattern.decorator;

import android.util.Log;

/**
 * 装饰者具体实现类
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        Log.d("ConcreteDecoratorA","ConcreteDecoratorA operate before super");
        super.operate();
        Log.d("ConcreteDecoratorA","ConcreteDecoratorA operate after super");
    }
}
