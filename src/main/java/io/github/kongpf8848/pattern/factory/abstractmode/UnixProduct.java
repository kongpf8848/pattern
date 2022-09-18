package io.github.kongpf8848.pattern.factory.abstractmode;

/**
 * Created by pengf on 2017/3/5.
 */
public class UnixProduct implements IUnixProudct {
    @Override
    public void createText() {
        System.out.println("unix text");
    }

    @Override
    public void createButton() {
        System.out.println("unix button");
    }
}
