package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.chain.AbstractLogger;
import io.github.kongpf8848.pattern.chain.ConsoleLogger;
import io.github.kongpf8848.pattern.chain.ErrorLogger;
import io.github.kongpf8848.pattern.chain.FileLogger;
import org.junit.Test;

public class ChainTest {

    @Test
    public void test(){
        //责任链模式
        System.out.println("责任链模式+++++++++++++++++++++++++++++++++++");
        AbstractLogger errorLogger = new ErrorLogger();
        AbstractLogger fileLogger = new FileLogger();
        AbstractLogger consoleLogger = new ConsoleLogger();
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        AbstractLogger loggerChain = errorLogger;
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
