package io.github.kongpf8848.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by pengf on 2017/3/21.
 */
public class DynamicProxy implements InvocationHandler {

    private Object subject;

    public DynamicProxy(Object subject)
    {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        method.invoke(subject,args);
        return null;
    }
}
