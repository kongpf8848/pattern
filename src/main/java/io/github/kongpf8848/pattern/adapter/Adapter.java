package io.github.kongpf8848.pattern.adapter;

//适配器类，继承了被适配类，同时实现标准接口
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        System.out.println("我是适配器类 我能适配任何两孔插座 让它正常工作");
        this.specificRequest();
    }
}
