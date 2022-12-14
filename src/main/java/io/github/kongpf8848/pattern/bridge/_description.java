package io.github.kongpf8848.pattern.bridge;

/**
 * Created by pengf on 2017/4/24.
 */
public class _description {
    /*
    桥接模式，将抽象部分与它的实现部分分离，使它们都可以独立地变化。
    抽象化(Abstraction)与实现化(Implementation)脱耦，使得二者可以独立地变化
    桥接模式将继承关系转换为关联关系，从而降低了类与类之间的耦合，减少了代码编写量。

    抽象化：抽象化就是忽略一些信息，把不同的实体当作同样的实体对待。在面向对象中，将对象的共同性质抽取出来形成类的过程即为抽象化的过程。
    实现化：针对抽象化给出的具体实现，就是实现化，抽象化与实现化是一对互逆的概念，实现化产生的对象比抽象化更具体，是对抽象化事物的进一步具体化的产物。

    脱耦：脱耦就是将抽象化和实现化之间的耦合解脱开，或者说是将它们之间的强关联改换成弱关联，将两个角色之间的继承关系改为关联关系。桥接模式中的所谓脱耦，就是指在一个软件系统的抽象化和实现化之间使用关联关系（组合或者聚合关系）而不是继承关系，从而使两者可以相对独立地变化，这就是桥接模式的用意。




    抽象类(Abstraction):定义抽象类的接口,维护一个指向Implementor类型对象的指针

    扩充抽象类(RefinedAbstraction)：扩充由Abstraction定义的接口

    实现类接口(Implementor)：定义实现类的接口，该接口不一定要与 Abstraction的接口完全一致；事实上这两个接口可以完全不同。一般来讲， Implementor接口仅提供基本操作，而 Abstraction则定义了基于这些基本操作的较高层次的操作。

    具体实现类(ConcreteImplementor)：实现Implementor接口并定义它的具体实现。

     */
}
