package org.example.creation.factory.simple;

public class TestProduct {
    public static void main(String[] args) {
        /* 原先的创建对象的方式
        Product product1 = new Product1();
        product1.operation1();
        product1.operation2();

        Product product2 = new Product2();
        product2.operation1();
        product2.operation2();
         */
        // 不需要创建商品，直接从工厂获取
        Product p1 = SimpleFactory.getProduct("p1");
        Product p2 = SimpleFactory.getProduct("p2");

        p1.operation1();
        p1.operation2();

        p2.operation1();
        p2.operation2();

        SimpleFactory.getProduct("").operation1();
    }
}
