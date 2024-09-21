package behavioral.interpreter.expressionInterface;

import behavioral.interpreter.context.Context;

public interface Expression {
    int interpret(Context context);
}
