package io.github.kongpf8848.pattern.interpreter;

/**
 * Created by pengf on 2017/4/24.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }
    @Override
    public boolean interpret(String context) {
        if(context.contains(data))
        {
            return true;
        }
        return false;
    }
}
