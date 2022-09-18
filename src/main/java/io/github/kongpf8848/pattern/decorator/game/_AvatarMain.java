package io.github.kongpf8848.pattern.decorator.game;

public class _AvatarMain {
    public static void main(String[] args) {
        Avatar avatar=new GreenHair(new WhiteJacket(new BlackPants(new Hunter())));
        System.out.println(avatar.getDescription());

        Avatar avatar2=new RedHair(new RedJacket(new WhitePants(new Mage())));
        System.out.println(avatar2.getDescription());
    }
}
