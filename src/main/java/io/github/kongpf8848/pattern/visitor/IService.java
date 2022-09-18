package io.github.kongpf8848.pattern.visitor;

/**
 * Created by pengf on 2017/4/21.
 */
public interface IService {

    public void accept(Visitor visitor);
}
