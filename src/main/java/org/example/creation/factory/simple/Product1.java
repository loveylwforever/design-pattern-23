package org.example.creation.factory.simple;

public class Product1 implements Product {
    @Override
    public void operation1() {
        System.out.println("Product1 ---> operation1");
    }

    @Override
    public void operation2() {
        System.out.println("Product1 ---> operation2");
    }
}
