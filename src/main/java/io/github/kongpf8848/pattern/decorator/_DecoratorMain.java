package io.github.kongpf8848.pattern.decorator;

public class _DecoratorMain {
    public static void main(String[] args) {
        //装饰者模式
        System.out.println("++++++++++++++++++++++++++++++++装饰者模式++++++++++++++++++++++++++++++++");
        ConcreteComponent man = new ConcreteComponent();
        ConcreteDecoratorA manDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB manDecoratorB = new ConcreteDecoratorB();
        manDecoratorA.setPerson(man);
        manDecoratorB.setPerson(manDecoratorA);
        manDecoratorB.eat();


    }
}
