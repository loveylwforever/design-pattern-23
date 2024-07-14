<table>
  <tr>
    <td style="width: 70px;text-align: center;font-weight: bold;">目的</td>
    <td style="width: 60px;text-align: center;font-weight: bold;">范围</td>
    <td style="font-weight: bold;">名称</td>
    <td style="font-weight: bold;">描述</td>
  </tr>
  <tr>
    <td rowspan="5" style="text-align: center;color: green">创建型</td>
    <td colspan="1" style="text-align: center;">类</td>
    <td colspan="1" style="text-align: left;">工厂方法模式(Factory Method)</td>
    <td colspan="1" style="text-align: left;">定义一个用于创建对象的接口，让子类决定将哪一个类实例化。工厂方法使一个类的实例化延迟到其子类。</td>
  </tr>
  <tr>
    <td rowspan="4" style="text-align: center;">对象</td>
    <td colspan="1" style="text-align: left;">抽象工厂模式(Abstract Factory)</td>
    <td colspan="1" style="text-align: left;">提供一个创建一系列相关或互相依赖对象的接口，而无需指定它们具体的类。</td>
  </tr>
  <tr>
    <td colspan="1" style="text-align: left;">建造者模式(Builder)</td>
    <td colspan="1" style="text-align: left;">将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。</td>
  </tr>
  <tr>
    <td colspan="1" style="text-align: left;">原型模式(Prototype)</td>
    <td colspan="1" style="text-align: left;">用原型实例指定创建对象的种类，并且通过拷贝这个原型来创建新的对象。</td>
  </tr>
  <tr>
    <td colspan="1" style="text-align: left;">单例模式(singleton)</td>
    <td colspan="1" style="text-align: left;">保证一个类仅有一个实例:并提供一个访问它的全局访问点。</td>
  </tr>

  <tr>
    <td rowspan="7" style="text-align: center;color: yellow">结构型</td>
    <td colspan="1" style="text-align: center;">类</td>
    <td colspan="1" style="text-align: left;">适配器模式(Adapter)</td>
    <td colspan="1" style="text-align: left;">一个类的接口转换成客户希望的另一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。</td>
  </tr>
  <tr>
    <td rowspan="6" style="text-align: center;">对象</td>
    <td colspan="1" style="text-align: left;">桥接模式(Bridge)</td>
    <td colspan="1" style="text-align: left;">将抽象部分与它的实现部分分离，使它们都可以独立地变化。</td>
  </tr>
  <tr>
    <td colspan="1" style="text-align: left;">组合模式(Composite)</td>
    <td colspan="1" style="text-align: left;">将对象组合成树形结构以表示"部分-整体"的层次结构。Composite使得客户对单个对象和复合对象的使用具有一致性。</td>
  </tr>
  <tr>
    <td colspan="1" style="text-align: left;">装饰模式(Decorator)</td>
    <td colspan="1" style="text-align: left;">动态地给一个对象添加一些额外的职责。就扩展功能而言，Decorator模式比生成子类方式更为灵活。</td>
  </tr>
  <tr>
    <td colspan="1" style="text-align: left;">外观模式(Facade)</td>
    <td colspan="1" style="text-align: left;">运用共享技术有效地支持人量细粒度的对象。</td>
  </tr>
  <tr>
    <td colspan="1" style="text-align: left;">享元模式(Flyweight)</td>
    <td colspan="1" style="text-align: left;">为子系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口,这个接口使得这一子系统更加容易使用。</td>
  </tr>
  <tr>
    <td colspan="1" style="text-align: left;">代理模式(Proxy)</td>
    <td colspan="1" style="text-align: left;">为其他对象提供一个代理以控制对这个对象的访问。</td>
  </tr>
  <tr>
    <td rowspan="11" style="text-align: center;color: red">行为型</td>
    <td rowspan="2" style="text-align: center;">类</td>
    <td colspan="1" style="text-align: left;">解释器模式(Interpreter)</td>
    <td colspan="1" style="text-align: left;">给定一个语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子。</td>
  </tr>
  <tr>
    <td colspan="1" style="text-align: left;">模板方法模式(Template Method)</td>
    <td colspan="1" style="text-align: left;">定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。</td>
  </tr>

  <tr>
    <td rowspan="9" style="text-align: center;">对象</td>
    <td colspan="1" style="text-align: left;">责任链模式(Chain Of Responsibility)</td>
    <td colspan="1" style="text-align: left;">为解除请求的发送者和接收者之间耦合，而使多个对象都有机会处理这个请求。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它。</td>
  </tr>

  <tr>
    <td colspan="1" style="text-align: left;">命令模式(Command)</td>
    <td colspan="1" style="text-align: left;">将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化;对请求排队或记录请求日志，以及支持可职消的操作。</td>
  </tr>

  <tr>
    <td colspan="1" style="text-align: left;">迭代器模式(Iterator)</td>
    <td colspan="1" style="text-align: left;">提供一种方法顺序访问一个聚合对象中各个元素，而又不需要暴露该对象的内部表示。</td>
  </tr>

<tr>
    <td colspan="1" style="text-align: left;">中介者模式(Mediator)</td>
    <td colspan="1" style="text-align: left;">用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。</td>
  </tr>

<tr>
    <td colspan="1" style="text-align: left;">备忘录模式(Memento)</td>
    <td colspan="1" style="text-align: left;">在不破坏封装性的前提下，捕获一个对象的内部状态。</td>
  </tr>

<tr>
    <td colspan="1" style="text-align: left;">观察者模式(Observer)</td>
    <td colspan="1" style="text-align: left;">定义对象间的一种一对多的依赖关系，以便当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并自动刷新。</td>
  </tr>

<tr>
    <td colspan="1" style="text-align: left;">状态模式(State)</td>
    <td colspan="1" style="text-align: left;">允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它所属的类。</td>
  </tr>

<tr>
    <td colspan="1" style="text-align: left;">策略模式(Strategy)</td>
    <td colspan="1" style="text-align: left;">定义一系列的算法,把它们一个个封装起来,并且使它们可相互替换。本模式使得算法的变化可独立于使用它的客户。</td>
  </tr>

<tr>
    <td colspan="1" style="text-align: left;">访问者模式(Visitor)</td>
    <td colspan="1" style="text-align: left;">表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。</td>
  </tr>
</table>