package io.github.kongpf8848.pattern.decorator;

/**
 * Created by pengf on 2017/3/12.
 */
public class Decorator implements Component {

    private Component component;

    public void setPerson(Component component)
    {
        this.component=component;
    }

    @Override
    public void eat() {
        this.component.eat();
    }
}
