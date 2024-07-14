package org.example.behaviour;

/**
 * 问题：
 * 在某些情况下，一个软件系统可能需要根据不同的情境或条件使用不同的算法或行为，但是这些算法的选择和使用可能会频繁变化。
 * 如果将这些算法都硬编码在主要的类中，会导致代码的臃肿不堪，难以维护和扩展。
 * 需要一种方式来灵活地选择和切换不同的算法，同时又不影响到客户端代码。
 * <p>
 * 解决方案：
 * 策略模式提供了一种定义一系列算法的方法，将这些算法封装成独立的策略类，并使它们可以相互替换。
 * 在客户端中，创建一个上下文（Context）对象，该对象包含一个对策略类的引用，通过该引用调用相应的策略方法。
 * 这样，客户端可以在运行时选择不同的策略，而不需要修改上下文类。
 * <p>
 * 效果：
 * 策略模式的主要优点是实现了算法的解耦，使得算法可以独立于客户端而变化。
 * 它提高了代码的可维护性和扩展性，因为新的策略可以很容易地添加到系统中。
 * 然而，策略模式也可能导致类的数量增加，因为每个算法都需要一个对应的策略类。
 * 在使用策略模式时，需要权衡类的数量与灵活性之间的关系。
 * <p>
 * 总之，策略模式是一种非常有用的设计模式，特别适用于需要根据情境灵活选择不同算法或行为的场景，帮助保持代码的结构清晰且易于维护。
 */
public class Strategy {
    // 首先，我们定义一个接口 MathOperation，表示数学操作的策略
    // 定义策略接口
    interface MathOperation {
        int operate(int a, int b);
    }

    // 实现加法策略
    static class Addition implements MathOperation {
        @Override
        public int operate(int a, int b) {
            return a + b;
        }
    }

    // 实现减法策略
    static class Subtraction implements MathOperation {
        @Override
        public int operate(int a, int b) {
            return a - b;
        }
    }

    // 实现乘法策略
    static class Multiplication implements MathOperation {
        @Override
        public int operate(int a, int b) {
            return a * b;
        }
    }

    // 然后，我们创建一个 Calculator 类，它接受一个数学操作策略，并根据用户的选择执行相应的操作
    static class Calculator {
        private MathOperation operation;

        public void setOperation(MathOperation operation) {
            this.operation = operation;
        }

        public int performOperation(int a, int b) {
            if ( null != operation) {
                return operation.operate(a, b);
            }

            throw new IllegalStateException("No operation set");
        }
    }

    // 我们通过创建不同的数学操作策略类来实现加法、减法和乘法功能，并通过设置不同的策略来执行不同的操作。
    // 这就是策略模式的基本思想。
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperation(new Addition());
        System.out.println(calculator.performOperation(1, 2));

        calculator.setOperation(new Subtraction());
        System.out.println(calculator.performOperation(5, 3));

        calculator.setOperation(new Multiplication());
        System.out.println(calculator.performOperation(2, 4));
    }
}
