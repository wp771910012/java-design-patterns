## Intent 目的 ## 
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

不同条件下创建不同实例

## explanation 代码解释 ##

To create a kingdom we need objects with common theme. Elven kingdom needs an Elven king, Elven castle and Elven army whereas Orcish kingdom needs an Orcish king, Orcish castle and Orcish army. There is a dependency between the objects in the kingdom.

要创建一个王国，我们需要具有共同主题的对象。 精灵王国需要一个精灵王，精灵城堡和精灵军队，而兽人王国需要一个兽人国王，兽人城堡和兽人军队。 王国中的物体之间存在依赖关系。

## Applicability 适用性 ##
Use the Abstract Factory pattern when:

* a system should be independent of how its products are created, composed and represented  系统应独立于其产品的创建，组合和表示方式
* a system should be configured with one of multiple families of products   系统应配置多个产品系列之一
* a family of related product objects is designed to be used together, and you need to enforce this constraint   一系列相关产品对象旨在一起使用，您需要强制执行此约束
* you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations    你想提供一个产品类库，你想要只暴露它们的接口，而不是它们的实现
* the lifetime of the dependency is conceptually shorter than the lifetime of the consumer.  依赖的生命周期在概念上比消费者的生命周期短。
* you need a run-time value to construct a particular dependency  您需要一个运行时值来构造特定的依赖项
* you want to decide which product to call from a family at runtime.   您想要决定在运行时从一个系列调用哪个产品。
* you need to supply one or more parameters only known at run-time before you can resolve a dependency.   在决定依赖关系之前，您需要提供仅在运行时已知的一个或多个参数。