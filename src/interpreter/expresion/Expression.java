package interpreter.expresion;

import interpreter.Context;

/**
 * Created by hao.yan on 2015/11/6.
 */
public interface Expression {
    public int interpret(Context context);
}
