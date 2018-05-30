package com.weips.designpattern.decorator;

/**
 * 抽象装饰着
 * 内部有一个指向组件对象的引用
 */
public abstract class Decorator extends Component {
    private Component mComponent;

    public Decorator(Component component){
        this.mComponent = component;
    }

    @Override
    public void operate(){
        mComponent.operate();
    }
}
