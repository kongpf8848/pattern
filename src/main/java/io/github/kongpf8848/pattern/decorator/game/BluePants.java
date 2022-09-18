package io.github.kongpf8848.pattern.decorator.game;

public class BluePants extends AvatarDecorator {
    public BluePants(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+蓝色裤子";
    }
}
