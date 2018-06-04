package com.weips.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.weips.designpattern.decorator.Component;
import com.weips.designpattern.decorator.ConcreteComponent;
import com.weips.designpattern.decorator.ConcreteDecoratorA;
import com.weips.designpattern.proxy.ISubject;
import com.weips.designpattern.proxy.InvocationHandlerImpl;
import com.weips.designpattern.proxy.ProxySubject;
import com.weips.designpattern.proxy.RealSubject;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        decorator();
        proxy();
    }

    private void proxy() {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.operate();

        InvocationHandlerImpl handlerImpl = new InvocationHandlerImpl(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        ISubject proxySubject_2 = (ISubject) Proxy.newProxyInstance(classLoader,
                new Class[]{ISubject.class}, handlerImpl);
        proxySubject_2.operate();
    }

    private void decorator() {
        Component component = new ConcreteComponent();
        ConcreteDecoratorA decoratorAComponent = new ConcreteDecoratorA(component);

        decoratorAComponent.operate();
    }
}
