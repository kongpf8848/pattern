package io.github.kongpf8848.pattern.state;

/**
 * Created by pengf on 2017/4/21.
 */
public interface VoteState {

     void vote(String user, String voteItem, VoteManager voteManager);
}
