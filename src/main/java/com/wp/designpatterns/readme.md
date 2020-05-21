# design patterns 设计模式 #

## 23 design patterns 23种设计模式 ##

### [creational 创建型模式](./creational) ###

* [abstract factory 抽象工厂模式](./creational/abstractfactory)
* [singleton 单例模式](./creational/singleton)
* [builder 建造者模式](./creational/builder)
* [prototype 原型模式](./creational/prototype)

### [Structural 构建型模式](./structural) ###

* [adapter 适配器模式](./structural/adapter)
* [decorator 装饰器模式](./structural/decorator)
* [bridge 桥接模式](./structural/bridge)
* [facade 外观模式](./structural/facade)
* [proxy 代理模式](./structural/proxy)
* [filter 过滤器模式](./structural/filter)
* [composite 组合模式](./structural/composite)
* [flyweight 享元模式](./structural/flyweight)

### Behavioral 行为型模型 ###

这些设计模式特别关注对象之间的通信。

* [chain of responsibility 责任链模式](./behavioral/chainofresponsibility)
* [observer 观察者模式](./behavioral/observer)
* [template 模板模式](./behavioral/template)
* [command 命令模式](./behavioral/command)
* **interpreter 解释器模式 :** 给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子
* **iterator 迭代器模式 :** 集合中含有迭代器：分离了集合对象的遍历行为，抽象出一个迭代器类来负责，无须暴露该对象的内部表示
* **mediator 中介者模式 :** 对象与对象之间存在大量的关联关系，将对象之间的通信关联关系封装到一个中介类中单独处理，从而使其耦合松散，可以独立地改变它们之间的交互
* **strategy 策略模式 :** 策略对象依赖注入到context对象，context对象根据它的策略改变而改变它的相关行为(可通过调用内部的策略对象实现相应的具体策略行为)
* **state 状态模式 :** 状态对象依赖注入到context对象，context对象根据它的状态改变而改变它的相关行为(可通过调用内部的状态对象实现相应的具体行为)
* **memento 备忘录模式 :** 通过一个备忘录类专门存储对象状态。客户通过备忘录管理类管理备忘录类。
* **null object 空对象模式 :** 创建一个未对该类做任何实现的空对象类，该空对象类将无缝地使用在需要检查空值的地方。不要为了屏蔽null而使用空对象，应保持用null，远比用非null的值来替代“无值”要好。（慎用）
