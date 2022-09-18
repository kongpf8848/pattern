package io.github.kongpf8848.pattern.bridge;

public class SmallBrushPenRefinedAbstraction extends BrushPenAbstraction {
    @Override
    public void operationDraw() {
        System.out.println("Small and "+implementorColor.getColor()+" drawing");
    }
}
