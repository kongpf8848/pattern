package io.github.kongpf8848.pattern.proxy;

/**
 * Created by pengf on 2017/3/3.
 */
public class ProxyRole implements AbstractRole {
    private RealRole realRole;

    public ProxyRole(RealRole realRole) {

        this.realRole = realRole;
    }

    @Override
    public void operation() {
        System.out.println("proxy begin");
        realRole.operation();
        System.out.println("proxy end");
    }

}
