package behavioral.interpreter.interpreter;

import behavioral.interpreter.expressionInterface.Expression;
import behavioral.interpreter.nonTerminalExpression.AddExpression;
import behavioral.interpreter.nonTerminalExpression.SubtractExpression;
import behavioral.interpreter.terminalExpression.NumberExpression;
import behavioral.interpreter.terminalExpression.VariableExpression;

import java.util.Stack;

public class Interpreter {

    public static Expression parse(String expression) {
        Stack<Expression> stack = new Stack<>();

        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.equals("+")) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                stack.push(new AddExpression(leftExpression, rightExpression));
            } else if (token.equals("-")) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                stack.push(new SubtractExpression(leftExpression, rightExpression));
            } else {
                Expression variableExpression = isNumeric(token) ?
                        new NumberExpression(Integer.parseInt(token)) :
                        new VariableExpression(token);
                stack.push(variableExpression);
            }
        }
        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
