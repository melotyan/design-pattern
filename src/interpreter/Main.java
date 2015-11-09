package interpreter;

import interpreter.expresion.Expression;

/**
 * Created by hao.yan on 2015/11/6.
 */
public class Main {

    public static void main(String[] args) {
        String str = "a+b+c-d";
        Context context = new Context();
        context.add("a", 1);
        context.add("b", 2);
        context.add("c", 3);
        context.add("d", 5);

        Expression expression = context.analysis(str);
        System.out.println(expression.interpret(context));

    }

}
