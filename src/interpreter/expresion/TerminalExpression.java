package interpreter.expresion;

import interpreter.Context;

/**
 * Created by hao.yan on 2015/11/6.
 */
public class TerminalExpression implements Expression {
    private int val;

    public TerminalExpression(int val) {
        this.val = val;
    }

    @Override
    public int interpret(Context context) {
        return val;
    }
}
