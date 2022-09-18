package io.github.kongpf8848.pattern.prototype;

/**
 * Created by pengf on 2017/3/9.
 */
public class Test {

    public static void main(String[] args) {
        Prototype doc1 = new Prototype();
        doc1.setText("这是一篇文档");
        doc1.addImage("图片1");
        doc1.addImage("图片2");
        doc1.addImage("图片3");
        doc1.show();
        System.out.println("==============================================");

        Prototype doc2 = doc1.clone();
        doc2.show();
        System.out.println("==============================================");

        doc2.setText("这是修改过的文档");
        doc2.addImage("图片4");
        doc2.show();
        System.out.println("==============================================");

        doc1.show();
        System.out.println("==============================================");
    }
}
