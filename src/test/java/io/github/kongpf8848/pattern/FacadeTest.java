package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.facade.Facade;
import org.junit.Test;

public class FacadeTest {

    @Test
    public void test(){
        //外观模式
        System.out.println("外观模式+++++++++++++++++++++++++++++++++++");
        Facade facade = new Facade();
        facade.Method();
    }
}
