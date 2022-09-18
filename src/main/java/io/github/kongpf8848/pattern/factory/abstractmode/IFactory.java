package io.github.kongpf8848.pattern.factory.abstractmode;

/**
 * Created by pengf on 2017/3/5.
 */
public interface IFactory {

    IWindowProudct createWindowProudct();
    IUnixProudct createUnixProduct();
}
