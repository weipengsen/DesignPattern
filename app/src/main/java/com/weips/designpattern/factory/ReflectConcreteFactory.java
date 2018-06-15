package com.weips.designpattern.factory;

public class ReflectConcreteFactory<T extends Product> extends ReflectFactory {
    private T t;

    @Override
    public Product createProduct() {
        try {
            return (Product) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
