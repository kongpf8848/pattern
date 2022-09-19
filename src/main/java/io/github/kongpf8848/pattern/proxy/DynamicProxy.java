package io.github.kongpf8848.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by pengf on 2017/3/21.
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object subject)
    {
        this.object = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=method.invoke(object,args);
        return result;
    }
}
