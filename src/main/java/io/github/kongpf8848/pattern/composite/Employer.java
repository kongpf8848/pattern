package io.github.kongpf8848.pattern.composite;

import java.util.List;

/**
 * Created by pengf on 2017/3/12.
 */
public abstract class Employer
{
    private String name;

    public List<Employer> employers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Employer employer);
    public abstract void remove(Employer employer);


    public List<Employer> getEmployers() {
        return employers;
    }

}
