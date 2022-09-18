package io.github.kongpf8848.pattern.visitor;

/**
 * Created by pengf on 2017/4/21.
 */
public class Visitor {

    public void process(Saving saving)
    {
        System.out.println("存款");
    }
    public void process(Draw saving)
    {
        System.out.println("取款");
    }
    public void process(Fund saving)
    {
        System.out.println("基金");
    }
}
