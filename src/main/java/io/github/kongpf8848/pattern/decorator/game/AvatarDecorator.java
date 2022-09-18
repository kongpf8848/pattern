package io.github.kongpf8848.pattern.decorator.game;

public class AvatarDecorator implements Avatar  {
    private Avatar avatar;
    public AvatarDecorator(Avatar avatar){
        this.avatar=avatar;
    }
    @Override
    public String getDescription() {
        return avatar.getDescription();
    }
}
