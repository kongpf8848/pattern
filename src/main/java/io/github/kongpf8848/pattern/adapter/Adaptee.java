package io.github.kongpf8848.pattern.adapter;

//已存在的、具有特殊功能、但不符合我们既有的标准接口的类
public class Adaptee {

    public void specificRequest(){
        System.out.println("被适配类...我是两孔插座,具有特殊功能");
    }
}
