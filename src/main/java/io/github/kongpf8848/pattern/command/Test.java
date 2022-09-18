package io.github.kongpf8848.pattern.command;

public class Test {

    public static void main(String[]args) {
        System.out.println("命令模式+++++++++++++++++++++++++++++++++++");
        Receiver receiver = new Receiver();
        ICommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.SetCommand(command);
        invoker.ExecuteCommand();
    }
}
