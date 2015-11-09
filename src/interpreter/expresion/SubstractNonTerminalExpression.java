package interpreter.expresion;

import interpreter.Context;
import observer.subject.Subject;

/**
 * Created by hao.yan on 2015/11/9.
 */
public class SubstractNonTerminalExpression implements Expression {
    private Expression left;
    private Expression right;

    public SubstractNonTerminalExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}
