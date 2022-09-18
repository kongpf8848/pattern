package io.github.kongpf8848.pattern.mediator;

/**
 * Created by pengf on 2017/4/23.
 */
public class ColleagueB extends Colleague  {
    @Override
    protected void getMessage(String content) {
        System.out.println("同事B得到信息："+content);
    }

    public ColleagueB(String name, IMediator mediator) {
        super(name, mediator);
    }


}
