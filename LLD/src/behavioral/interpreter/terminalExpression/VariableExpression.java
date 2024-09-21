package behavioral.interpreter.terminalExpression;

import behavioral.interpreter.context.Context;
import behavioral.interpreter.expressionInterface.Expression;

public class VariableExpression implements Expression {
    private String variable;

    public VariableExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Context context) {
        return context.lookup(variable);
    }
}
