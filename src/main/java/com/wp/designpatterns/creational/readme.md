## creational 创建型模式 ##

这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用新的运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活

* **abstract factory 抽象工厂模式 :** Provide an interface for creating families of related or dependent objects without specifying their concrete classes. 不同条件下创建不同实例
* **singleton 单例模式 :** Ensure a class only has one instance, and provide a global point of access to it.  保证一个类仅有一个实例
* **builder 建造者模式 :** 将一个复杂的构建过程与其具表示细节相分离，使得同样的构建过程可以创建不同的表示
* **prototype 原型模式 :** 通过拷贝原型创建新的对象
