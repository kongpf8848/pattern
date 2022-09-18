package io.github.kongpf8848.pattern.decorator.game;

public class BlackJacket extends AvatarDecorator {
    public BlackJacket(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+黑色上衣";
    }
}
