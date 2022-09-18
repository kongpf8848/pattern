package io.github.kongpf8848.pattern.visitor;

/**
 * Created by pengf on 2017/4/21.
 */
public class Fund implements IService {
    @Override
    public void accept(Visitor visitor) {
        visitor.process(this);
    }
}
