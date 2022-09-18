package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.interpreter.AndExpression;
import io.github.kongpf8848.pattern.interpreter.Expression;
import io.github.kongpf8848.pattern.interpreter.OrExpression;
import io.github.kongpf8848.pattern.interpreter.TerminalExpression;
import org.junit.Test;

public class InterpreterTest {

    @Test
    public void test(){

        //解释器模式
        System.out.println("解释器模式+++++++++++++++++++++++++++++++++++");
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Jugglie"));
    }

    public Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public  Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
