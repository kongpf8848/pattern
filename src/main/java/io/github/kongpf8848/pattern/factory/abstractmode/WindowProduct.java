package io.github.kongpf8848.pattern.factory.abstractmode;

/**
 * Created by pengf on 2017/3/5.
 */
public class WindowProduct implements IWindowProudct {
    @Override
    public void createText() {
        System.out.println("window text");
    }

    @Override
    public void createButton() {
        System.out.println("window button");
    }
}
