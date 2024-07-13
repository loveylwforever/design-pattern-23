package org.example.creation;

/**
 * 建造者模式（Builder）
 * 问题：
 * 在某些情况下，一个对象的创建过程非常复杂，涉及多个步骤，每个步骤都可能有不同的实现方式。
 * 如果将所有创建逻辑放在一个类中，会导致该类变得庞大且难以维护。
 * 此外，如果需要创建不同的变体对象，就需要在该类中添加更多的逻辑，使得代码变得混乱。
 * <p>
 * 解决方案：
 * 建造者模式提供了一种将一个复杂对象的构建过程与其表示分离的方法。
 * 它将对象的构建过程封装在一个独立的"建造者"类中，由该类负责逐步构建对象。
 * 这样，可以根据需要创建不同的建造者来构建不同的对象变体。
 * <p>
 * 通常，建造者模式涉及以下角色：
 * 产品（Product）：表示正在构建的复杂对象。建造者模式的目标是构建这个产品。
 * 抽象建造者（Abstract Builder）：定义了构建产品的步骤和方法，但没有具体的实现。不同的具体建造者可以实现不同的构建步骤，从而创建不同的产品变体。
 * 具体建造者（Concrete Builder）：实现了抽象建造者定义的方法，完成了产品的构建过程。每个具体建造者负责构建特定的产品变体。
 * 指导者（Director）：负责控制建造的过程。它通过将客户端与具体建造者分离，确保产品的构建是按照一定顺序和规则进行的。
 * <p>
 * 建造者模式的效果包括：
 * 分离构建过程和表示：通过建造者模式，可以将复杂对象的构建过程与其最终表示分离，使得构建过程更加清晰可控。
 * 支持不同的表示：通过使用不同的具体建造者，可以创建不同的产品表示，而不改变客户端的代码。
 * 更好的可扩展性：如果需要添加新的产品变体，只需创建一个新的具体建造者即可，而无需修改已有的代码。
 * 隐藏产品的内部结构：客户端只需与抽象建造者和指导者交互，无需关心产品的内部构建细节。
 * <p>
 * 总之，建造者模式适用于需要构建复杂对象，且构建过程涉及多个步骤或变体的情况。通过将构建过程分解为可重用的步骤，建造者模式提供了一种结构化的方法来创建对象。
 */
public class Builder {
    // 首先，我们定义房屋类 House，它具有多个属性，如地基、结构、屋顶和装修。
    static class House {
        private String foundation;
        private String structure;
        private String roof;
        private String interior;

        public void setFoundation(String foundation) {
            this.foundation = foundation;
        }

        public void setStructure(String structure) {
            this.structure = structure;
        }

        public void setRoof(String roof) {
            this.roof = roof;
        }

        public void setInterior(String interior) {
            this.interior = interior;
        }

        @Override
        public String toString() {
            return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior + "]";
        }
    }

    // 然后，我们创建一个抽象建造者类 HouseBuilder，它定义了构建房屋的方法。
    abstract static class HouseBuilder {
        protected House house = new House();

        public abstract void buildFoundation();

        public abstract void buildStructure();

        public abstract void buildRoof();

        public abstract void buildInterior();

        public House getHouse() {
            return house;
        }
    }

    // 接下来，我们创建两个具体的建造者类 ConcreteHouseBuilder 和 LuxuryHouseBuilder
    // 分别实现了不同类型房屋的构建过程。
    // 具体建造者类 - 普通房屋
    static class ConcreteHouseBuilder extends HouseBuilder {
        @Override
        public void buildFoundation() {
            house.setFoundation("Standard Foundation");
        }

        @Override
        public void buildStructure() {
            house.setStructure("Standard Structure");
        }

        @Override
        public void buildRoof() {
            house.setRoof("Standard Roof");
        }

        @Override
        public void buildInterior() {
            house.setInterior("Standard Interior");
        }
    }

    // 具体建造者类 - 豪华房屋
    static class LuxuryHouseBuilder extends HouseBuilder {
        @Override
        public void buildFoundation() {
            house.setFoundation("Strong Foundation");
        }

        @Override
        public void buildStructure() {
            house.setStructure("Reinforced Structure");
        }

        @Override
        public void buildRoof() {
            house.setRoof("Elegant Roof");
        }

        @Override
        public void buildInterior() {
            house.setInterior("Luxury Interior");
        }
    }

    // 最后，我们创建指导者类 Director，它协调建造过程并返回构建的房屋对象。
    static class Director {
        private final HouseBuilder builder;

        public Director(HouseBuilder builder) {
            this.builder = builder;
        }

        public House constructHouse() {
            builder.buildFoundation();
            builder.buildStructure();
            builder.buildRoof();
            builder.buildInterior();
            return builder.getHouse();
        }
    }

    public static void main(String[] args) {
        HouseBuilder concreteBuilder = new ConcreteHouseBuilder();
        Director director1 = new Director(concreteBuilder);
        House concreteHouse = director1.constructHouse();
        System.out.println("Concrete House: " + concreteHouse);

        HouseBuilder luxuryBuilder = new LuxuryHouseBuilder();
        Director director2 = new Director(luxuryBuilder);
        House luxuryHouse = director2.constructHouse();
        System.out.println("Luxury House: " + luxuryHouse);
    }
}
