package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.visitor.*;
import org.junit.Test;

public class VisitorTest {
    @Test
    public void test(){

        //访问者模式
        System.out.println("访问者模式+++++++++++++++++++++++++++++++++++");
        IService saving = new Saving();
        IService fund = new Fund();
        IService draw = new Draw();
        Visitor visitor = new Visitor();
        saving.accept(visitor);
        fund.accept(visitor);
        draw.accept(visitor);
    }
}
