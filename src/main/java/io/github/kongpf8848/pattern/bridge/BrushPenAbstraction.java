package io.github.kongpf8848.pattern.bridge;

public abstract class BrushPenAbstraction {

    protected ImplementorColor implementorColor;

    public void setImplementorColor(ImplementorColor implementorColor) {
        this.implementorColor = implementorColor;
    }

    public abstract void operationDraw();
}
