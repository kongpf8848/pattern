package io.github.kongpf8848.pattern.mediator;

/**
 * Created by pengf on 2017/4/23.
 */
public abstract class Colleague {

    protected String name;
    protected IMediator mediator;


    protected abstract void getMessage(String content);


    public Colleague(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }
}
