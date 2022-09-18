package io.github.kongpf8848.pattern.flyweight;

import java.util.Hashtable;

/**
 * Created by pengf on 2017/4/23.
 */
public class FlyweightFactory {

    private static final Hashtable<String,Flyweight>flyweightHashtable=new Hashtable<String,Flyweight>();


    public static Flyweight getFlyweight(String str)
    {
        Flyweight flyweight=flyweightHashtable.get(str);
        if(flyweight==null)
        {
            flyweight=new ConcreteFlyweight(str);
            System.out.println("+++++++++++++++++++create flyweight of:"+str);
            flyweightHashtable.put(str,flyweight);
        }
        return flyweight;
    }

    public static int getFlyweightSize()
    {
        return flyweightHashtable.size();
    }
}
