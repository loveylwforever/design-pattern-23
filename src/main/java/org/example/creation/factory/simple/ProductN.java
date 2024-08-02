package org.example.creation.factory.simple;

public class ProductN implements Product{
    @Override
    public void operation1() {
        System.out.println("Sorry, operation1 is not permitted!");
    }

    @Override
    public void operation2() {
        System.out.println("Sorry, operation2 is not permitted!");
    }
}
