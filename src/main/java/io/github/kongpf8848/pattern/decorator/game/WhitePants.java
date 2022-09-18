package io.github.kongpf8848.pattern.decorator.game;

public class WhitePants extends AvatarDecorator {
    public WhitePants(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+白色裤子";
    }
}
