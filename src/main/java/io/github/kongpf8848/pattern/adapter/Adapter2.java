package io.github.kongpf8848.pattern.adapter;

//对象适配器
public class Adapter2 implements Target {

    // 直接关联被适配类
    private Adaptee adaptee;

    // 可以通过构造函数传入具体需要适配的被适配类对象
    public Adapter2(Adaptee adaptee){
        this.adaptee=adaptee;
    }

    @Override
    public void request() {
        System.out.println("我是适配器类 我能适配任何两孔插座 让它正常工作");
        this.adaptee.specificRequest();
    }
}
