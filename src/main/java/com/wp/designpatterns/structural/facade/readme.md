How does a goldmine work? "Well, the miners go down there and dig gold!" you say. That is what you believe because you are using a simple interface that goldmine provides on the outside, internally it has to do a lot of stuff to make it happen. This simple interface to the complex subsystem is a facade.

金矿是如何运作的？ “好吧，矿工们去那里挖金子！”你说。这就是你所认为的，因为你正在使用金矿在外部提供的简单接口，在内部它必须做很多事情来实现它。这个复杂子系统的简单接口是一个外观。

## Applicability ##
Use the Facade pattern when ：

* you want to provide a simple interface to a complex subsystem. Subsystems often get more complex as they evolve. Most patterns, when applied, result in more and smaller classes. This makes the subsystem more reusable and easier to customize, but it also becomes harder to use for clients that don't need to customize it. A facade can provide a simple default view of the subsystem that is good enough for most clients. Only clients needing more customizability will need to look beyond the facade.  您想为复杂的子系统提供简单的接口。子系统随着它们的发展变得越来越复杂。大多数模式在应用时会导致更多更小的类。这使得子系统更易于重复使用并且更易于自定义，但对于不需要自定义它的客户端也变得更难使用。外观可以提供子系统的简单默认调用，对大多数客户端来说足够好。只有需要更多可定制性的客户才需要超越外观。
* there are many dependencies between clients and the implementation classes of an abstraction. Introduce a facade to decouple the subsystem from clients and other subsystems, thereby promoting subsystem independence and portability.  客户端和抽象的实现类之间存在许多依赖关系。引入外观以将子系统与客户端和其他子系统分离，从而提升子系统的独立性和可移植性。
* you want to layer your subsystems. Use a facade to define an entry point to each subsystem level. If subsystems are dependent, then you can simplify the dependencies between them by making them communicate with each other solely through their facades.  你想分层你的子系统。使用外观来定义每个子系统级别的入口点。如果子系统是依赖的，那么您可以通过使它们仅通过它们的外观相互通信来简化它们之间的依赖关系。