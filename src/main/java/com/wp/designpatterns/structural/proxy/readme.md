Imagine a tower where the local wizards go to study their spells. The ivory tower can only be accessed through a proxy which ensures that only the first three wizards can enter. Here the proxy represents the functionality of the tower and adds access control to it.

想象一下当地巫师进入研究他们的法术的塔。象牙塔只能通过代理进入，确保只有前三个巫师可以进入。这里代理代理塔的功能并为其添加访问控制。

## Applicability ##
Proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object than a simple pointer. Here are several common situations in which the Proxy pattern is applicable

当需要相比普通参数更通用或更复杂的对象引用时，代理就适用。以下是代理模式适用的几种常见情况：

* Remote proxy provides a local representative for an object in a different address space.  远程代理为不同地址空间中的对象提供本地代表。
* Virtual proxy creates expensive objects on demand.  虚拟代理按需创建更有价值的对象。
* Protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.  保护代理控制对原始对象的访问。当对象需要拥有不同的访问权限时，保护代理很有用