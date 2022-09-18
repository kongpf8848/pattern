package io.github.kongpf8848.pattern.proxy;

/**
 * Created by pengf on 2017/3/21.
 */
public class RealSubject implements Subject {
    @Override
    public void hello(String str) {
        System.out.println("hello: " + str);
    }
}
