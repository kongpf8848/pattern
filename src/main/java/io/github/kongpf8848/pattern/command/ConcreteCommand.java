package io.github.kongpf8848.pattern.command;

/**
 * Created by pengf on 2017/4/20.
 */
public class ConcreteCommand implements ICommand {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
