package io.github.kongpf8848.pattern.decorator;

/**
 * Created by pengf on 2017/3/12.
 */
public class ConcreteComponent implements Component {
    @Override
    public void eat() {
        System.out.println("man eat");
    }
}
