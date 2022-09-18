package io.github.kongpf8848.pattern.singleton;

/**
 * enum
 */
public enum Singleton3 {

    INSTANCE;
    Singleton3() {
    }

    public static Singleton3 getInstance() {
        return INSTANCE;
    }

}
