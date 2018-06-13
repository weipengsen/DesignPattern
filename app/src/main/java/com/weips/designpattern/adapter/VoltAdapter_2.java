package com.weips.designpattern.adapter;

/**
 * 对象适配器模式
 * 适配器持有被适配的对象
 */
public class VoltAdapter_2 implements FiveVolt {

    Volt220 mVolt220;

    public VoltAdapter_2(Volt220 volt220) {
        mVolt220 = volt220;
    }

    @Override
    public int get5V() {
        return mVolt220.getVolt220() / 44;
    }
}
