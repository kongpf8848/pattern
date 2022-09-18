package io.github.kongpf8848.pattern.chain;

/**
 * Created by pengf on 2017/4/24.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(){
        super(AbstractLogger.INFO);
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
