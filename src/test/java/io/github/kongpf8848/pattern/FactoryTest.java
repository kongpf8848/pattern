package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.factory.IShape;
import io.github.kongpf8848.pattern.factory.ShapeFactory;
import io.github.kongpf8848.pattern.factory.abstractmode.Factory;
import io.github.kongpf8848.pattern.factory.abstractmode.IFactory;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void testSimpleFactory(){

        // 简单工厂模式
        System.out.println("简单工厂模式+++++++++++++++++++++++++++++++++++");
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取 Circle 的对象，并调用它的 draw 方法
        IShape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        IShape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        IShape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }

    @Test
    public void testFactory(){
        //抽象工厂模式
        System.out.println("抽象工厂模式+++++++++++++++++++++++++++++++++++");
        IFactory factory = new Factory();
        factory.createWindowProudct().createText();
        factory.createWindowProudct().createButton();
        factory.createUnixProduct().createText();
        factory.createUnixProduct().createButton();

    }
}
