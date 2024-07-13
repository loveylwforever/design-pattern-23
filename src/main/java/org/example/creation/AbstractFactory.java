package org.example.creation;

/**
 * 抽象工厂模式（Abstract Factory）
 * 问题：
 * 在某些情况下，需要创建一系列相关或相互依赖的对象，这些对象属于一组相关的产品族。
 * 同时，系统需要保证这些产品族之间的一致性。如果直接在代码中创建这些对象，会使得代码与具体产品的细节紧密耦合，不利于后续的扩展和维护。
 * <p>
 * 解决方案：
 * 抽象工厂模式提供了一个接口，用于创建一系列相关或相互依赖的对象。
 * 通过使用抽象工厂接口及其具体实现，可以将对象的创建与客户端代码分离，从而实现系统的松耦合。
 * <p>
 * 抽象工厂模式涉及多个角色：
 * 抽象工厂（Abstract Factory）：声明了一组用于创建不同产品的抽象方法。具体的工厂类必须实现这些方法来创建具体的产品对象。
 * 具体工厂（Concrete Factory）：实现抽象工厂接口，负责创建特定种类的产品对象。
 * 抽象产品（Abstract Product）：定义了产品的通用接口，具体产品必须实现这个接口。
 * 具体产品（Concrete Product）：实现抽象产品接口，是抽象工厂创建的实际对象。
 * <p>
 * 抽象工厂模式的使用可以带来以下效果：
 * 产品族一致性：抽象工厂确保创建的产品是一组相关的产品族，保证了这些产品之间的一致性。
 * 松耦合：客户端代码不需要直接依赖于具体产品，只需要通过抽象工厂接口创建产品，从而降低了代码的耦合度。
 * 可扩展性：增加新的产品族或产品变得相对容易，只需要添加新的具体工厂和产品类即可，不需要修改现有代码。
 * <p>
 * 限制：抽象工厂模式要求系统中的每个产品族都必须有一个对应的具体工厂，这可能增加了系统的复杂性。
 * 抽象工厂模式适用于需要创建一系列相关产品并保证它们之间一致性的情况，例如图形界面库中的UI元素，不同操作系统下的界面组件等。
 * 通过使用抽象工厂模式，可以更好地管理和组织这些产品的创建过程。
 */
public class AbstractFactory {
    // 抽象产品接口：操作系统
    interface OperatingSystem {
        void run();
    }

    // 具体产品：Windows操作系统
    static class WindowsOS implements OperatingSystem {
        @Override
        public void run() {
            System.out.println("Running Windows OS");
        }
    }

    // 具体产品：Linux操作系统
    static class LinuxOS implements OperatingSystem {
        @Override
        public void run() {
            System.out.println("Running Linux OS");
        }
    }

    // 抽象产品接口：应用程序
    interface Application {
        void open();
    }

    // 具体产品：Word应用程序
    static class WordApplication implements Application {
        @Override
        public void open() {
            System.out.println("Opening Word Application");
        }
    }

    // 具体产品：Excel应用程序
    static class ExcelApplication implements Application {
        @Override
        public void open() {
            System.out.println("Opening Excel Application");
        }
    }

    // 抽象工厂接口
    interface SoftwareFactory {
        OperatingSystem createOperatingSystem();

        Application createApplication();
    }

    // 具体工厂：Windows工厂
    static class WindowsFactory implements SoftwareFactory {
        @Override
        public OperatingSystem createOperatingSystem() {
            return new WindowsOS();
        }

        @Override
        public Application createApplication() {
            return new ExcelApplication();
        }
    }

    // 具体工厂：Linux工厂
    static class LinuxFactory implements SoftwareFactory {
        @Override
        public OperatingSystem createOperatingSystem() {
            return new LinuxOS();
        }

        @Override
        public Application createApplication() {
            return new WordApplication();
        }
    }

    // 在这个示例中，抽象工厂模式通过SoftwareFactory接口和其实现类来创建不同类型的操作系统和应用程序。
    // 客户端代码可以根据需要选择不同的工厂实例来创建不同的产品组合。
    public static void main(String[] args) {
        SoftwareFactory windowsFactory = new WindowsFactory();
        OperatingSystem windowsOS = windowsFactory.createOperatingSystem();
        Application windowsApp = windowsFactory.createApplication();

        windowsOS.run();
        windowsApp.open();

        SoftwareFactory linuxFactory = new LinuxFactory();
        OperatingSystem linuxOS = linuxFactory.createOperatingSystem();
        Application linuxApp = linuxFactory.createApplication();

        linuxOS.run();
        linuxApp.open();
    }
}
