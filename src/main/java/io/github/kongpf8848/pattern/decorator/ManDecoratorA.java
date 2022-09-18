package io.github.kongpf8848.pattern.decorator;

/**
 * Created by pengf on 2017/3/12.
 */
public class ManDecoratorA extends Decorator {

    @Override
    public void eat()
    {
        super.eat();
        System.out.println("re eat");
        System.out.println("ManDecoratorA");
    }
}
