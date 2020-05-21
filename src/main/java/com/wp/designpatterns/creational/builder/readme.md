## Intent 目的 ## 
Separate the construction of a complex object from its representation so that the same construction process can create different representations.

将复杂对象的构造与其表示分开，以便相同的构造过程可以创建不同的表示。

## explanation 代码解释 ##

Imagine a character generator for a role playing game. The easiest option is to let computer create the character for you. But if you want to select the character details like profession, gender, hair color etc. the character generation becomes a step-by-step process that completes when all the selections are ready.

想象一下角色扮演游戏的角色生成器。 最简单的选择是让计算机为你创建角色。 但是如果你想选择职业，性别，头发颜色等角色细节，那么角色生成就会逐步完成所有选择准备就绪的过程。

## Applicability 适用性 ## 
Use the Builder pattern when:

* the algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled  用于创建复杂对象的算法应独立于构成对象的部分以及它们的组装方式
* the construction process must allow different representations for the object that's constructed  构造过程必须允许对构造的对象进行不同的实现