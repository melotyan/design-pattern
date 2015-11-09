package interpreter.expresion;

import interpreter.Context;

/**
 * Created by hao.yan on 2015/11/6.
 */
public class AddNonTerminalExpression implements Expression {
    private Expression left;
    private Expression right;

    public AddNonTerminalExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
