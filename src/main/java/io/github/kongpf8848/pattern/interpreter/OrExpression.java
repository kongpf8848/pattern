package io.github.kongpf8848.pattern.interpreter;

/**
 * Created by pengf on 2017/4/24.
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return this.expr1.interpret(context) || this.expr2.interpret(context);
    }
}
