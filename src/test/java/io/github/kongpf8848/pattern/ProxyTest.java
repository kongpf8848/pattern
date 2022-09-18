package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.proxy.*;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void testProxy(){
        //代理模式
        System.out.println("代理模式+++++++++++++++++++++++++++++++++++");
        RealRole realrole = new RealRole();
        ProxyRole proxy = new ProxyRole(realrole);
        proxy.operation();
    }

    @Test
    public void testDynamicProxy(){
        //动态代理模式
        System.out.println("动态代理模式+++++++++++++++++++++++++++++++++++");
        Subject realSubject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(realSubject);
        Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),new Class<?>[] { Subject.class }, handler);
        subject.hello("jack");

    }
}
