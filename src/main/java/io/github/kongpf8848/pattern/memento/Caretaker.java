package io.github.kongpf8848.pattern.memento;

/**
 * Created by pengf on 2017/4/24.
 */
public class Caretaker {
    private Memento memento;
    public Memento getMemento(){
        return memento;
    }
    public void setMemento(Memento memento){
        this.memento = memento;
    }
}
