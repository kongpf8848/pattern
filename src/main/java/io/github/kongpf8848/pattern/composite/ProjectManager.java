package io.github.kongpf8848.pattern.composite;

import java.util.ArrayList;

/**
 * Created by pengf on 2017/3/12.
 */
public class ProjectManager extends Employer
{

    public ProjectManager(String name) {
        setName(name);
        employers= new ArrayList<>();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void remove(Employer employer) {
       employers.remove(employer);
    }
}
