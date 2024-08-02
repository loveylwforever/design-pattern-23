package org.example.creation.factory.simple;

public class SimpleFactory {
    public static Product getProduct(String type) {
        Product product = null;
        if ( "p1".equals(type)) {
            product = new Product1();
        }
        else if ( "p2".equals(type) ) {
            product = new Product2();
        }
        else {
            product = new ProductN();
        }
        return product;
    }
}
