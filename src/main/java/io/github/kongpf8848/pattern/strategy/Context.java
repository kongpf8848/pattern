package io.github.kongpf8848.pattern.strategy;

/**
 * Created by pengf on 2017/4/20.
 */
public class Context {

    private Strategy strategy;
    /**
     * 构造函数，传入一个具体策略对象
     * @param strategy    具体策略对象
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    /**
     * 策略方法
     */
    public void contextInterface(){

        strategy.strategyInterface();
    }
}
