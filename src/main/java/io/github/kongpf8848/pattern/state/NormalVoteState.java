package io.github.kongpf8848.pattern.state;

/**
 * Created by pengf on 2017/4/21.
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(user,voteItem);
        System.out.println("投票成功");
    }
}
