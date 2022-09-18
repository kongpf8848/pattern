package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.strategy.ConcreteStrategyB;
import io.github.kongpf8848.pattern.strategy.Context;
import org.junit.Test;

public class StategyTest {

    @Test
    public void test() {

        //策略模式
        System.out.println("策略模式+++++++++++++++++++++++++++++++++++");
        ConcreteStrategyB strategy = new ConcreteStrategyB();
        Context context = new Context(strategy);
        context.contextInterface();

    }
}
