package io.github.kongpf8848.pattern.bridge;

public class MiddleBrushPenRefinedAbstraction extends BrushPenAbstraction {
    @Override
    public void operationDraw() {
        System.out.println("Middle and "+implementorColor.getColor()+" drawing");
    }
}
