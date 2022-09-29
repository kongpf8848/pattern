package io.github.kongpf8848.pattern.chain;

public interface Interceptor {
    ActionResponse intercept(Chain chain);
}
