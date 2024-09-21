package behavioral.interpreter.client;

import behavioral.interpreter.context.Context;
import behavioral.interpreter.expressionInterface.Expression;
import behavioral.interpreter.interpreter.Interpreter;

public class Main {
    public static void main(String[] args) {
        String expression = "x 10 + y -";  // Equivalent to (x + 10 - y)

        // Create a context and assign values to variables
        Context context = new Context();
        context.assign("x", 5);
        context.assign("y", 3);

        // Parse the expression and evaluate it in the given context
        Expression parsedExpression = Interpreter.parse(expression);
        System.out.println("Result: " + parsedExpression.interpret(context));  // Output: 12
    }
}
