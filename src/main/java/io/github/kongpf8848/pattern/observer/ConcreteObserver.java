package io.github.kongpf8848.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by pengf on 2017/4/16.
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("状态发生改变：" + arg);
    }
}
