package io.github.kongpf8848.pattern.state;

/**
 * Created by pengf on 2017/4/21.
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }
}
