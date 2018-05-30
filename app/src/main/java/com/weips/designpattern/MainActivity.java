package com.weips.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.weips.designpattern.decorator.Component;
import com.weips.designpattern.decorator.ConcreteComponent;
import com.weips.designpattern.decorator.ConcreteDecoratorA;
import com.weips.designpattern.singleton.SingletonManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Component component = new ConcreteComponent();
        ConcreteDecoratorA decoratorAComponent = new ConcreteDecoratorA(component);

        decoratorAComponent.operate();
    }
}
