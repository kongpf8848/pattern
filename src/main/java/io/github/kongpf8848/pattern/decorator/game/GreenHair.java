package io.github.kongpf8848.pattern.decorator.game;

public class GreenHair extends AvatarDecorator {
    public GreenHair(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+绿色头发";
    }
}
