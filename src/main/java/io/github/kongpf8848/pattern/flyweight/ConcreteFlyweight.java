package io.github.kongpf8848.pattern.flyweight;

/**
 * Created by pengf on 2017/4/23.
 */
public class ConcreteFlyweight extends Flyweight {

    private String string;

    public ConcreteFlyweight(String string) {
        this.string = string;
    }

    @Override
    public void operation() {
        System.out.println("ConcreteFlyweight:"+string);
    }
}
