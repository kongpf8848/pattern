package io.github.kongpf8848.pattern.decorator.game;

public class RedJacket extends AvatarDecorator {
    public RedJacket(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+红色上衣";
    }
}
