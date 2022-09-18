package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.memento.Caretaker;
import io.github.kongpf8848.pattern.memento.Originator;
import org.junit.Test;

public class MementoTest {

    @Test
    public void test(){

        //备忘录模式
        System.out.println("备忘录模式+++++++++++++++++++++++++++++++++++");
        Originator originator = new Originator();
        originator.setState("状态1");
        System.out.println("初始状态:"+originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("状态2");
        System.out.println("改变后状态:"+originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复后状态:"+originator.getState());
    }
}
