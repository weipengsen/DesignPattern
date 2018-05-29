package com.weips.designpattern.singleton;


/**
 * 单例模式
 * 定义：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
 * <p>
 * 使用场景：确保某个类有且只有一个对象的场景，避免产生多个对象消耗过多的资源，或者某中类型的对象只应该有且只有一个。
 * <p>
 * 关键点：1.构造函数不对外开放，一般为Private; 2.通过一个静态方法返回单例对象；
 * 3.确保单例类的对象有且只有一个，尤其是在多线程环境下；4.确保单例类对象在反序列化时不会重新构建对象。
 */


/**
 * Double CheckLock
 * 优点：资源利用率高，第一次执行 getInstance 时单例对象才会被实例化，效率高。
 * 缺点：第一次加载反应稍慢。
 */
public class W1_Singleton {
    private static W1_Singleton sInstance = null;

    private W1_Singleton() {

    }

    public static W1_Singleton getInstance() {
        if (sInstance == null) {
            synchronized (W1_Singleton.class) {
                if (sInstance == null) {
                    sInstance = new W1_Singleton();
                }
            }
        }
        return sInstance;
    }
}
