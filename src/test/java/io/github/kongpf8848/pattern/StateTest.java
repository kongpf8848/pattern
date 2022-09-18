package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.state.VoteManager;
import org.junit.Test;

public class StateTest {

    @Test
    public void test() {

        //状态模式
        System.out.println("状态模式+++++++++++++++++++++++++++++++++++");
        VoteManager vm = new VoteManager();

        for (int i = 0; i < 9; i++) {
            vm.vote("jack", "A");
        }

    }
}
