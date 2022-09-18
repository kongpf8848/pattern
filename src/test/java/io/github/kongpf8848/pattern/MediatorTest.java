package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.mediator.ColleagueA;
import io.github.kongpf8848.pattern.mediator.ColleagueB;
import io.github.kongpf8848.pattern.mediator.ConcreteMediator;
import org.junit.Test;

public class MediatorTest {

    @Test
    public void test(){
        //中介者模式
        System.out.println("中介者模式+++++++++++++++++++++++++++++++++++");
        ConcreteMediator mediator = new ConcreteMediator();
        ColleagueA colleagueA = new ColleagueA("张三", mediator);
        ColleagueB colleagueB = new ColleagueB("李四", mediator);
        mediator.setCollA(colleagueA);
        mediator.setCollB(colleagueB);
        colleagueA.contact("我是A,我要和同事B说说工作的事情");
        colleagueB.contact("我是B,我下午有时间,下午商量吧");


    }
}
