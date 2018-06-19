package com.weips.designpattern.factory;

public class ConcreteReflectionFactory extends ReflectionFactory {

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;

        try {
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) product;
    }
}
