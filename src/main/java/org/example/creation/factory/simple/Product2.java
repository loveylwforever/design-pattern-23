package org.example.creation.factory.simple;

public class Product2 implements Product {

    @Override
    public void operation1() {
        System.out.println("Product2 ---> operation1");
    }

    @Override
    public void operation2() {
        System.out.println("Product2 ---> operation2");
    }
}
