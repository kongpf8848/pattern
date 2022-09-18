package io.github.kongpf8848.pattern.command;

/**
 * Created by pengf on 2017/4/20.
 */
public class Invoker {
    private ICommand command;

    public void SetCommand(ICommand command) {
        this.command = command;
    }

    public void ExecuteCommand() {
        command.execute();

    }
}
