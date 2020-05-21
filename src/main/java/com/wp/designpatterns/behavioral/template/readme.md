## Intent 目的 ##

Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure. 

在操作中定义算法的骨架，将一些步骤推迟到子类。模板方法允许子类重新定义算法的某些步骤而不改变算法的结构。

## Applicability ##
The Template Method pattern should be used:

* to implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary
  算法的不变部分只实现一次，并将可能变化的部分留给子类来实现
* when common behavior among subclasses should be factored and localized in a common class to avoid code duplication. This is good example of "refactoring to generalize" as described by Opdyke and Johnson. You first identify the differences in the existing code and then separate the differences into new operations. Finally, you replace the differing code with a template method that calls one of these new operations
  子类之间的共同方法可以封装一个公共类中进行本地化来避免代码重复时。这是Opdyke和Johnson所描述的“重构概括”的好例子。首先确定现有代码中的差异，然后将差异分成新的方法。最后，通过调用其中一个新操作的模板方法来替换不同的代码
* to control subclasses extensions. You can define a template method that calls "hook" operations at specific points, thereby permitting extensions only at those points
  控制子类扩展。您可以定义在特定点调用“hook”操作的模板方法，从而仅允许在这些点处进行扩展