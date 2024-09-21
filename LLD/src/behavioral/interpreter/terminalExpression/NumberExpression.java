package behavioral.interpreter.terminalExpression;

import behavioral.interpreter.context.Context;
import behavioral.interpreter.expressionInterface.Expression;

public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return this.number;
    }
}
