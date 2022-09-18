package io.github.kongpf8848.pattern.decorator.game;

public class RedHair extends AvatarDecorator {
    public RedHair(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+红色头发";
    }
}
