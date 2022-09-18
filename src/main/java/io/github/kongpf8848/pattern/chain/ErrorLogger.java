package io.github.kongpf8848.pattern.chain;

/**
 * Created by pengf on 2017/4/24.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        super(AbstractLogger.ERROR);
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard ErrorLogger::Logger: " + message);
    }
}
