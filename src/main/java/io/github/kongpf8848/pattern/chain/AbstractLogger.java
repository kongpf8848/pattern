package io.github.kongpf8848.pattern.chain;

/**
 * Created by pengf on 2017/4/24.
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    protected AbstractLogger nextLogger;
    protected int level;

    public AbstractLogger(int level)
    {
        this.level=level;
    }
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
            return;
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
