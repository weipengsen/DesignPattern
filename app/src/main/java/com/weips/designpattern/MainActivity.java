package com.weips.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.weips.designpattern.Observer.Coder;
import com.weips.designpattern.Observer.Manager;
import com.weips.designpattern.adapter.Volt220;
import com.weips.designpattern.adapter.VoltAdapter_1;
import com.weips.designpattern.adapter.VoltAdapter_2;
import com.weips.designpattern.chainofresponsibility.ConcreteHandlerA;
import com.weips.designpattern.chainofresponsibility.ConcreteHandlerB;
import com.weips.designpattern.chainofresponsibility.Interceptor;
import com.weips.designpattern.chainofresponsibility.RealChain;
import com.weips.designpattern.chainofresponsibility.RealInterceptorA;
import com.weips.designpattern.chainofresponsibility.RealInterceptorB;
import com.weips.designpattern.decorator.Component;
import com.weips.designpattern.decorator.ConcreteComponent;
import com.weips.designpattern.decorator.ConcreteDecoratorA;
import com.weips.designpattern.factory.ConcreteFactory;
import com.weips.designpattern.factory.ConcreteProductA;
import com.weips.designpattern.factory.Factory;
import com.weips.designpattern.factory.Product;
import com.weips.designpattern.factory.ConcreteReflectionFactory;
import com.weips.designpattern.factory.ReflectionFactory;
import com.weips.designpattern.flyweight.Ticket;
import com.weips.designpattern.flyweight.TicketFactory;
import com.weips.designpattern.proxy.ISubject;
import com.weips.designpattern.proxy.InvocationHandlerImpl;
import com.weips.designpattern.proxy.ProxySubject;
import com.weips.designpattern.proxy.RealSubject;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        decorator();
//        proxy();
//        adapter();
//        flyweight();
//        factory();
//        reflectFactory();
//        simpleResponsibility();
//        chainResponsibility();
        observer();
    }

    private void observer() {
        Manager manager = new Manager();
        Coder wei = new Coder("wei");
        Coder mou = new Coder("mou");
        Coder he = new Coder("he");
        Coder wu = new Coder("wu");

        manager.addObserver(wei);
        manager.addObserver(mou);
        manager.addObserver(he);
        manager.addObserver(wu);

        manager.declareMessage("明天放假");
    }

    private void chainResponsibility() {
        RealInterceptorA realInterceptorA = new RealInterceptorA();
        RealInterceptorB realInterceptorB = new RealInterceptorB();
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(realInterceptorA);
        interceptorList.add(realInterceptorB);

        Interceptor.Chain chain = new RealChain("", interceptorList, 0);
        String response = chain.procceed("BBB");
        Log.e(TAG, "response = " + response);
    }

    private void simpleResponsibility() {
        ConcreteHandlerA handlerA = new ConcreteHandlerA();
        ConcreteHandlerB handlerB = new ConcreteHandlerB();
        handlerA.successor = handlerB;
        handlerA.handleRequese("ABB");
    }


    private void reflectFactory() {
        ReflectionFactory factory = new ConcreteReflectionFactory();
        Product product = factory.createProduct(ConcreteProductA.class);
        product.method();
    }

    private void factory() {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.method();
    }

    private void flyweight() {
        Ticket ticket_1 = TicketFactory.getTicket("hangzhou", "guangzhou");
        ticket_1.showTicketInfo("xia");

        Ticket ticket_2 = TicketFactory.getTicket("hangzhou", "guangzhou");
        ticket_1.showTicketInfo("shang");

        Ticket ticket_3 = TicketFactory.getTicket("hangzhou", "hengshui");
        ticket_1.showTicketInfo("xia");
    }

    private void adapter() {
        Log.e(TAG, new VoltAdapter_1().get5V() + "");
        Log.e(TAG, new VoltAdapter_2(new Volt220()).get5V() + "");
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
