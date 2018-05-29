package com.weips.designpattern.singleton;

/**
 * 静态内部类单例模式
 * 第一次调用 getInstance 时初始化
 */
public class W2_Singleton {
    private W2_Singleton() {

    }

    public static W2_Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final W2_Singleton sInstance = new W2_Singleton();
    }
}
