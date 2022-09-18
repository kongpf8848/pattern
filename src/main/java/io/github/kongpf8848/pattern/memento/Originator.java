package io.github.kongpf8848.pattern.memento;

/**
 * Created by pengf on 2017/4/24.
 */
public class Originator {

    private String state = "";

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Memento createMemento(){
        return new Memento(this.state);
    }
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
