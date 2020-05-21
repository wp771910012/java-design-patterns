## Applicability  适用性 ##
Use the Adapter pattern when:

* you want to use an existing class, and its interface does not match the one you need  您想使用现有的类，其实现的接口与您需要的实现接口不匹配
* you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces  你想创建一个可重用的类，它与不相关或不可预见的类合作，即不一定具有兼容接口的类
* you need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one. An object adapter can adapt the interface of its parent class.   你需要使用几个现有的子类，但通过对每个子类进行子类化来调整它们的接口是不切实际的。对象适配器可以调整其父类的接口。
* most of the applications using third party libraries use adapters as a middle layer between the application and the 3rd party library to decouple the application from the library. If another library has to be used only an adapter for the new library is required without having to change the application code.   大多数使用第三方库的应用程序使用适配器作为应用程序和第三方库之间的中间层，以将应用程序与库分离。如果必须使用另一个库，则只需要新库的适配器，而无需更改应用程序代码。

## Real world examples 实例##
* java.util.Arrays#asList()
* java.util.Collections#list()
* java.util.Collections#enumeration()
* javax.xml.bind.annotation.adapters.XMLAdapter