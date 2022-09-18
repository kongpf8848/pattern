package io.github.kongpf8848.pattern.template;

public class Test {
    public static void main(String[]args){

        //模板方法模式
        System.out.println("模板方法模式+++++++++++++++++++++++++++++++++++");
        ImageLoader loader1 = new Glide();
        loader1.downloadImage("123");
        ImageLoader loader2 = new UIL();
        loader2.downloadImage("123");
        ImageLoader loader3 = new Piccsa();
        loader3.downloadImage("123");
    }
}
