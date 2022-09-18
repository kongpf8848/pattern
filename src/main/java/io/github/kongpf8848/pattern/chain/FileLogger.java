package io.github.kongpf8848.pattern.chain;

/**
 * Created by pengf on 2017/4/24.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger() {
        super(AbstractLogger.DEBUG);
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard FileLogger::Logger: " + message);
    }
}
