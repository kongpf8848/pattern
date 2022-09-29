package io.github.kongpf8848.pattern.chain;

public interface Chain {
    ActionRequest getRequest();
    ActionResponse proceed(ActionRequest request);
}
