package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.composite.Employer;
import io.github.kongpf8848.pattern.composite.Programmer;
import io.github.kongpf8848.pattern.composite.ProjectManager;
import org.junit.Test;

import java.util.List;

public class CompositeTest {

    @Test
    public void test(){

        //组合模式
        System.out.println("组合模式+++++++++++++++++++++++++++++++++++");
        Employer e1 = new Programmer("程序员1");
        Employer e2 = new Programmer("程序员2");
        Employer pm = new ProjectManager("项目经理");
        pm.add(e1);
        pm.add(e2);
        List<Employer> employerList = pm.getEmployers();
        for (Employer employer : employerList) {
            System.out.println(employer.getName());
        }


    }
}
