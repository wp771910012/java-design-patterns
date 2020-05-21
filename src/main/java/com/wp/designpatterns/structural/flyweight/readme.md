## Intent 目的 ## 
Use sharing to support large numbers of fine-grained objects efficiently.

使用共享可以有效地支持大量细粒度对象

## explanation 代码解释 ##

Alchemist's shop has shelves full of magic potions. Many of the potions are the same so there is no need to create new object for each of them. Instead one object instance can represent multiple shelf items so memory footprint remains small.

炼金术士的商店里摆满了魔法药水。许多药水是相同的，因此不需要为每个药水创建新的对象。相反，用一个对象实例表示多个同类型项目，可以使内存占用空间很小

## Applicability ##
The Flyweight pattern's effectiveness depends heavily on how and where it's used. Apply the Flyweight pattern when all of the following are true:
享元模式的有效性在很大程度上取决于它的使用方式和位置。满足以下所有条件时应用享元模式:

* an application uses a large number of objects  应用使用大量的对象
* storage costs are high because of the sheer quantity of objects  由于对象庞大，存储成本很高
* most object state can be made extrinsic  大多数对象可以在外部声明
* many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed
一旦外部声明被移除，许多对象组可被相对较少的共享对象替换
* the application doesn't depend on object identity. Since flyweight objects may be shared, identity tests will return true for conceptually distinct objects.
应用程序不依赖于对象标识。由于可以共享享元对象，因此对于概念上不同的对象，身份测试将返回true。