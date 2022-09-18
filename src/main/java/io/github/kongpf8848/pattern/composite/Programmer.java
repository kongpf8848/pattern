package io.github.kongpf8848.pattern.composite;

/**
 * Created by pengf on 2017/3/12.
 */
public class Programmer extends Employer {


    public Programmer(String name) {

        setName(name);
        employers=null;

    }


    @Override
    public void add(Employer employer) {

    }

    @Override
    public void remove(Employer employer) {

    }
}
