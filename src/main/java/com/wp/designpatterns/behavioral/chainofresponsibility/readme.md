## Intent 目的 ## 
Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

通过为多个对象提供处理请求的机会，避免将请求的发送者耦合到接收者。链接接收者并沿链传递请求，直到有对象处理它为止。

## explanation 代码解释 ##

The Orc King gives loud orders to his army. The closest one to react is the commander, then officer and then soldier. The commander, officer and soldier here form a chain of responsibility.

兽人国王向他的军队发出了巨大的命令。最先传达是指挥官，然后是军官，然后是士兵。这里的指挥官，军官和士兵构成了一系列责任。

## Applicability ##

Use Chain of Responsibility when

* more than one object may handle a request, and the handler isn't known a priori. The handler should be ascertained automatically
多个对象可以处理请求，并且处理程序不是先验已知的。应自动确定处理程序
* you want to issue a request to one of several objects without specifying the receiver explicitly
您希望向几个对象之一发出请求，而不明确指定接收方
* the set of objects that can handle a request should be specified dynamically 
期望动态指定可以处理请求的对象集