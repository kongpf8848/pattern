package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.builder.Student;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void test(){
        //Builder模式
        System.out.println("Builder模式+++++++++++++++++++++++++++++++++++");
        Student s = new Student.Builder().id(10).name("jack").sex("男").address("上海").build();
        System.out.println(s.getId() + "-" + s.getName() + "-" + s.getSex() + "-" + s.getAddress());
    }
}
