package io.github.kongpf8848.pattern.decorator.game;

public class GreenPants extends AvatarDecorator {
    public GreenPants(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+绿色裤子";
    }
}
