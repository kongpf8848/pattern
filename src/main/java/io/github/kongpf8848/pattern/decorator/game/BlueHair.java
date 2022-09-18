package io.github.kongpf8848.pattern.decorator.game;

public class BlueHair extends AvatarDecorator {
    public BlueHair(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+蓝色头发";
    }
}
