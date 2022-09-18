package io.github.kongpf8848.pattern.flyweight;

public class Test {


    public static void main(String[]args){
        //享元模式
        System.out.println("享元模式+++++++++++++++++++++++++++++++++++");
        Flyweight g1=FlyweightFactory.getFlyweight("google");
        Flyweight g2=FlyweightFactory.getFlyweight("baidu");
        Flyweight g3=FlyweightFactory.getFlyweight("google");
        Flyweight g4=FlyweightFactory.getFlyweight("google");
        Flyweight g5=FlyweightFactory.getFlyweight("ms");
        g1.operation();
        g2.operation();
        g3.operation();
        g5.operation();
        System.out.println(FlyweightFactory.getFlyweightSize());
    }

}
