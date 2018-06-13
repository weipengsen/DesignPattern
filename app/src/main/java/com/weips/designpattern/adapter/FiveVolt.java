package com.weips.designpattern.adapter;

/**
 * 定义：适配器模式把一个类的接口转化为客户端所期待的另一种接口，从而使原本因接口不匹配而无法一起工作的类能够一起工作。
 * 使用场景：1.接口不兼容 2.建立一个可以重复使用的类，用于与一些彼此不太关联的类，包括一些可能在将来引进的类一起工作
 *          3.需要一个统一的输出接口，而输入类的类型不可预知。
 */
public interface FiveVolt {
    public int get5V();
}
