package io.github.kongpf8848.pattern.proxy;

/**
 * Created by pengf on 2017/3/3.
 */
public class RealRole implements AbstractRole {

    @Override
    public void operation() {
        System.out.println("real role operation");
    }
}
