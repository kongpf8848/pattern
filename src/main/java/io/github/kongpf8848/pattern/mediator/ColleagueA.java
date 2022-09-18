package io.github.kongpf8848.pattern.mediator;

/**
 * Created by pengf on 2017/4/23.
 */
public class ColleagueA extends Colleague  {
    @Override
    protected void getMessage(String content) {
        System.out.println("同事A得到信息："+content);
    }

    public ColleagueA(String name, IMediator mediator) {
        super(name, mediator);
    }

}
