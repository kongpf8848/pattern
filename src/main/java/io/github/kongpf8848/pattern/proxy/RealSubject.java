package io.github.kongpf8848.pattern.proxy;

/**
 * Created by pengf on 2017/3/21.
 */
public class RealSubject implements Subject {
    @Override
    public void hello(String str) {
        System.out.println("hello: " + str);
    }

    @Override
    public void print(byte a,short b,char c,int d,long e,float f,double g,boolean h,String i){
        System.out.println("print");
    }
}
