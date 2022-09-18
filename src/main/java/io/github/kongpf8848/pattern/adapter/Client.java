package io.github.kongpf8848.pattern.adapter;

public class Client {

    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.request();

        Target adapter2 = new Adapter2(new Adaptee());
        adapter2.request();


    }
}