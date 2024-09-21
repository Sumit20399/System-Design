package behavioral.interpreter.context;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Integer> variableMap = new HashMap<>();

    public void assign(String variable, int value) {
        variableMap.put(variable, value);
    }

    public int lookup(String variable) {
        return variableMap.get(variable);
    }
}
