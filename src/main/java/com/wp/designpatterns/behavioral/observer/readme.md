## Intent 目的 ## 
Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

通定义对象之间的一对多依赖关系，以便当一个对象更改状态时，将自动通知和更新其所有依赖项。

## Applicability ##

Use the Observer pattern in any of the following situations

* when an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently
 抽象类有两个切面，一个依赖于另一个。将这些切面封装在单独的对象中可让您独立地改变和重用它们
* when a change to one object requires changing others, and you don't know how many objects need to be changed
当对一个对象的更改需要更改其他对象，并且您不知道需要更改多少个对象
* when an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled
当一个对象希望能够通知其他对象而不考虑这些对象是谁。换句话说，您不希望这些对象紧密耦合