package io.github.kongpf8848.pattern.decorator.game;

public class RedPants extends AvatarDecorator {
    public RedPants(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+红色裤子";
    }
}
