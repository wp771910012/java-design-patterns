## Intent 目的 ## 
Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
(将请求封装为对象，从而允许您使用不同的请求，队列或日志请求参数化客户端，并支持可撤销操作。)

## Applicability ##
Use the Command pattern when you want to:

* parameterize objects by an action to perform. You can express such parameterization in a procedural language with a callback function, that is, a function that's registered somewhere to be called at a later point. Commands are an object-oriented replacement for callbacks.
  (通过要执行的操作来参数化对象。您可以使用回调函数在代码中表达此类对象，也就是说，某个函数已注册到稍后要调用的某个位置。命令是代替回调函数的对象)
* specify, queue, and execute requests at different times. A Command object can have a lifetime independent of the original request. If the receiver of a request can be represented in an address space-independent way, then you can transfer a command object for the request to a different process and fulfill the request there
  (在不同时间声明，入栈和执行请求。 Command对象的生命周期可以独立于原始请求。如果请求的接收者可以以与地址空间无关的方式表示，那么您可以将请求的命令对象传输到另一个进程并在那里完成请求)
* support undo. The Command's execute operation can store state for reversing its effects in the command itself. The Command interface must have an added Unexecute operation that reverses the effects of a previous call to execute. Executed commands are stored in a history list. Unlimited-level undo and redo is achieved by traversing this list backwards and forwards calling unexecute and execute, respectively
  (支持撤消。 Command的执行操作可以存储状态以便通过命令本身撤销操作。 Command接口必须具有添加撤销的功能，该操作可以恢复先前执行调用的影响。执行的命令存储在历史列表中。通过遍历此列表并分别调用unexecute和execute来实现无限制的撤销和重做)
* support logging changes so that they can be reapplied in case of a system crash. By augmenting the Command interface with load and store operations, you can keep a persistent log of changes. Recovering from a crash involves reloading logged commands from disk and re-executing them with the execute operation
  (支持日志记录更改，以便在系统崩溃时可以回溯它们。通过使用加载和存储操作扩充Command接口，您可以持久化更改日志。通过磁盘重新加载已记录的命令并使用执行操作重新执行它们从崩溃中恢复)
* structure a system around high-level operations build on primitive operations. Such a structure is common in information systems that support transactions. A transaction encapsulates a set of changes to data. The Command pattern offers a way to model transactions. Commands have a common interface, letting you invoke all transactions the same way. The pattern also makes it easy to extend the system with new transactions
  (通过基本操作构建高级操作系统。这种结构在交易系统中很常见。事务封装了一组对数据的更改。 Command模式提供了一种模拟事务的方法。命令有一个通用接口，允许您以相同的方式调用所有事务。该模式还可以使用新事务扩展系统)