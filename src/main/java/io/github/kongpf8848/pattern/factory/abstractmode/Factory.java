package io.github.kongpf8848.pattern.factory.abstractmode;

/**
 * Created by pengf on 2017/3/5.
 */
public class Factory implements IFactory {

    @Override
    public IWindowProudct createWindowProudct() {
        return new WindowProduct();
    }

    @Override
    public IUnixProudct createUnixProduct() {
        return new UnixProduct();
    }
}
