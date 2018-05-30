package com.weips.designpattern.decorator;

/**
 * 装饰模式
 * <p>
 * 定义：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式比生成子类更加灵活。
 * <p>
 * 使用场景：需要动态且透明地扩展类的功能时。
 *
 * Android Context类使用此模式。
 */

/**
 * 抽象组件
 * 可以是一个接口或抽象类，充当的是被装饰的原始对象
 */
public abstract class Component {

    public abstract void operate();
}
