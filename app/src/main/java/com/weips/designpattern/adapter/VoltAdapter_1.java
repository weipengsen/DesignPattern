package com.weips.designpattern.adapter;

/**
 * 类适配器模式
 * 适配器继承需要被适配的类
 */
public class VoltAdapter_1 extends Volt220 implements FiveVolt {
    @Override
    public int get5V() {
        return super.getVolt220() / 44;
    }
}
