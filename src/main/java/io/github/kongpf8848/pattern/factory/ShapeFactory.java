package io.github.kongpf8848.pattern.factory;

/**
 * Created by pengf on 2017/3/5.
 */
public class ShapeFactory {
    public IShape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        return null;
    }
}
