## 提供3种单例的实现: ##
* DclIvoryTower 双检锁/双重校验锁
* EnumIvoryTower 枚举实现
* InnerIvoryTower 静态内部类

## Intent 目的 ## 
Ensure a class only has one instance, and provide a global point of access to it.

确保一个类只有一个实例，并提供一个全局访问点。

## explanation 代码解释 ##

There can only be one ivory tower where the wizards study their magic. The same enchanted ivory tower is always used by the wizards. Ivory tower here is singleton

只有一个象牙塔，巫师们可以在那里学习魔法。巫师总是使用同一个象牙塔。这里的象牙塔是单例

## Applicability ##
Use the Singleton pattern when:

* there must be exactly one instance of a class, and it must be accessible to clients from a well-known access point  必须只有一个类的实例，并且客户端必须可以同个全局访问点访问它
* when the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code
当唯一实例通过子类扩展时，客户端应该能够使用扩展实例而无需修改其代码
