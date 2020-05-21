## Intent 目的 ## 
Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

使用原型实例申明要创建的对象类型，并通过复制此实例来创建新对象。

## explanation 代码解释 ##
Remember Dolly? The sheep that was cloned! Lets not get into the details but the key point here is that it is all about cloning.

还记得多莉吗？被克隆的羊！让我们不要深究细节而是关注它如何被克隆。

## Applicability ##
Use the Prototype pattern when :

* a system should be independent of how its products are created, composed and represented  一个系统需要独立于其产品的创造，组成和表现方式
* when the classes to instantiate are specified at run-time, for example, by dynamic loading  当要在运行时指定要实例化的类时，例如，通过动态加载
* to avoid building a class hierarchy of factories that parallels the class hierarchy of products  避免构建与产品类层次结构相似的工厂类层次结构
* when instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state
当类的实例只能有几个不同的状态组合中得一个。相比手动实例化类，每次都要设置适当的状态，加载相应数量的原型并克隆它们可能更方便
* when object creation is expensive compared to cloning 与克隆相比，对象创建成本高昂