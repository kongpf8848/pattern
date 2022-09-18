package io.github.kongpf8848.pattern.state;

/**
 * Created by pengf on 2017/4/21.
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
