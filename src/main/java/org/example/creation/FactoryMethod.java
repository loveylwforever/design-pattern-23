package org.example.creation;

/**
 * 1. 工厂方法模式（Factory Method）
 * 问题：
 * 在软件设计中，我们经常遇到需要创建不同类型对象的情况。但是，如果直接在代码中实例化对象，会使代码紧密耦合在一起，难以维护和扩展。
 * 此外，如果对象的创建方式需要变化，那么就需要在整个代码中进行大量的修改。工厂方法模式旨在解决这个问题。
 * <p>
 * 解决方案：
 * 工厂方法模式提供了一个创建对象的接口，但是将具体的对象创建延迟到子类中。
 * 这样，客户端代码不需要知道要创建的具体对象的类，只需要通过工厂方法来创建对象。
 * 这使得客户端代码与具体对象的创建解耦，提高了代码的灵活性和可维护性。
 * 在工厂方法模式中，通常会定义一个抽象工厂类，其中包含一个创建对象的抽象方法，而具体的对象创建则由具体的子类实现。
 * 这样，每个具体的子类都可以根据需要创建不同类型的对象，而客户端代码只需要通过抽象工厂类来调用工厂方法，而不需要关心具体的对象创建细节。
 * <p>
 * 工厂方法模式的优点包括：
 * 松耦合：客户端代码与具体对象的创建解耦，使得系统更具弹性和可维护性。
 * 扩展性：通过添加新的具体工厂和产品子类，可以很容易地扩展系统以支持新的对象类型。
 * 封装性：将对象的创建集中在工厂类中，封装了对象的创建细节，使得客户端代码更简洁。
 * <p>
 * 然而，工厂方法模式也可能引入一些额外的复杂性，因为需要定义多个工厂类和产品类的层次结构。
 * 这可能会导致系统中类的数量增加。在选择使用工厂方法模式时，需要根据具体情况进行权衡。
 * 工厂方法模式在实际应用中非常常见，例如：
 * 图形库可以使用工厂方法模式来创建不同类型的图形对象
 * 数据库访问框架可以使用工厂方法模式来创建不同类型的数据库连接等。
 */
public class FactoryMethod {
    // 首先，我们需要定义一个图形接口
    interface Shape {
        void draw();
    }

    // 然后，我们实现两个具体的图形类，分别是 Circle（圆形）和 Rectangle（矩形）
    static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

    static class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle");
        }
    }

    // 接下来，我们创建一个抽象工厂类 ShapeFactory
    // 它定义了一个抽象的工厂方法 createShape，子类将实现这个方法来创建具体的图形对象
    abstract static class ShapeFactory {
        abstract Shape createShape();
    }

    // 然后，我们创建两个具体的工厂类，分别是 CircleFactory 和 RectangleFactory
    // 它们分别实现了 ShapeFactory 并重写了 createShape 方法来返回相应的图形对象
    static class CircleFactory extends ShapeFactory {
        @Override
        Shape createShape() {
            return new Circle();
        }
    }

    static class RectangleFactory extends ShapeFactory {
        @Override
        Shape createShape() {
            return new Rectangle();
        }
    }

    // 我们可以使用这些工厂类来创建图形对象
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
    }
}
