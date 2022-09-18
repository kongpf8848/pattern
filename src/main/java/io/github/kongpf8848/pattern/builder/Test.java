package io.github.kongpf8848.pattern.builder;

public class Test {

    public static void main(String[]args){
        //Builder模式
        System.out.println("Builder模式+++++++++++++++++++++++++++++++++++");
        Student s = new Student.Builder().id(10).name("jack").sex("男").address("上海").build();
        System.out.println(s.getId() + "-" + s.getName() + "-" + s.getSex() + "-" + s.getAddress());
    }
}
