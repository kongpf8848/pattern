package io.github.kongpf8848.pattern.observer;

import java.util.Observable;

/**
 * Created by pengf on 2017/4/16.
 */
public class ConcreteSubject extends Observable {

    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (!this.state.equals(state)) {
            this.state = state;
            setChanged();
        }
        notifyObservers(state);
    }


}
