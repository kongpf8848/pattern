package io.github.kongpf8848.pattern.state;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pengf on 2017/4/21.
 */
public class VoteManager {
    private Map<String,String> mapVote = new HashMap<String,String>();
    private VoteState state = null;
    private Map<String,Integer> mapVoteCount = new HashMap<String,Integer>();

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void vote(String user,String voteItem)
    {
        Integer voteCount=mapVoteCount.get(user);
        if(voteCount==null)
        {
            voteCount=0;
        }
        voteCount += 1;
        mapVoteCount.put(user, voteCount);

        if(voteCount == 1){
            state = new NormalVoteState();
        }
        else if(voteCount > 1 && voteCount < 5){
            state = new RepeatVoteState();
        }
        else if(voteCount >= 5 && voteCount <=8){
            state = new SpiteVoteState();
        }
        else if(voteCount > 8)
        {
            state = new BlackVoteState();
        }
        //然后转调状态对象来进行相应的操作
        state.vote(user, voteItem, this);
    }
}
