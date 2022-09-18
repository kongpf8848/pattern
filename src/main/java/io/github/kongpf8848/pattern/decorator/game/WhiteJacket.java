package io.github.kongpf8848.pattern.decorator.game;

public class WhiteJacket extends AvatarDecorator {
    public WhiteJacket(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+白色上衣";
    }
}
