package io.github.kongpf8848.pattern.decorator.game;

public class BlackPants extends AvatarDecorator {
    public BlackPants(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+黑色裤子";
    }
}
