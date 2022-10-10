package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.observer.ConcreteObserver;
import io.github.kongpf8848.pattern.observer.ConcreteSubject;
import org.junit.Test;

import java.util.Vector;

public class ObserverTest {
    @Test
    public void testObserver() {
        //观察者模式
        System.out.println("观察者模式+++++++++++++++++++++++++++++++++++");
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        concreteSubject.addObserver(observer1);
        concreteSubject.addObserver(observer2);
        concreteSubject.setState("jack");
    }
}
