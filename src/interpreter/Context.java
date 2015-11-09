package interpreter;

import interpreter.expresion.AddNonTerminalExpression;
import interpreter.expresion.Expression;
import interpreter.expresion.SubstractNonTerminalExpression;
import interpreter.expresion.TerminalExpression;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by hao.yan on 2015/11/6.
 */
public class Context {
    private Map<String, Integer> map = new HashMap<String, Integer>();
    private Stack<Expression> stack = new Stack<Expression>();

    public void add(String key, int value) {
        map.put(key, value);
    }

    public int get(String key) {
        return map.get(key);
    }

    public Expression analysis(String strExp) {
        char[] charArray = strExp.toCharArray();
        Expression left = null;
        Expression right = null;

        for (int i = 0; i < charArray.length; i++) {
            switch(charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new TerminalExpression(map.get(String.valueOf(charArray[++i])));
                    stack.push(new AddNonTerminalExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new TerminalExpression(map.get(String.valueOf(charArray[++i])));
                    stack.push(new SubstractNonTerminalExpression(left, right));
                    break;
                default:
                    stack.push(new TerminalExpression(map.get(String.valueOf(charArray[i]))));

            }
        }
        return stack.pop();
    }


}
