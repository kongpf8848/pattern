package io.github.kongpf8848.pattern.facade;

/**
 * Created by pengf on 2017/4/24.
 */
public class Facade {

    private Sub1 obj1 = new Sub1();
    private Sub2 obj2 = new Sub2();
    private Sub3 obj3 = new Sub3();

    public void Method()
    {
        obj1.operation();
        obj2.operation();
        obj3.operation();
    }
}
