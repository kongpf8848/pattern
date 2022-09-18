package io.github.kongpf8848.pattern.bridge;

public class Client {

    public static void main(String[]args){
        BrushPenAbstraction abstraction=new SmallBrushPenRefinedAbstraction();
        abstraction.setImplementorColor(new OncreteImplementorWhite());
        abstraction.operationDraw();
    }
}
