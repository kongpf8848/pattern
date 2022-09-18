package io.github.kongpf8848.pattern.bridge;

public class BigBrushPenRefinedAbstraction extends BrushPenAbstraction {
    @Override
    public void operationDraw() {
        System.out.println("Big and "+implementorColor.getColor()+" drawing");
    }
}
