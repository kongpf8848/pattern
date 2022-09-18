package io.github.kongpf8848.pattern.singleton;

/**
 * 饿汉模式
 */

public final class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
