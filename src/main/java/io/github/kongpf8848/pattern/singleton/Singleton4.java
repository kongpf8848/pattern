package io.github.kongpf8848.pattern.singleton;

/**
 * Holder
 */
public class Singleton4 {

    private static final class SingletonHolder {
        private static final Singleton4 instance = new Singleton4();
    }

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return SingletonHolder.instance;
    }
}
