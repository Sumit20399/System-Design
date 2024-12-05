package designs.splitwise;

import java.util.HashMap;
import java.util.Map;

public class BalanceSheet {
    private Map<String, Map<String, Double>> balances;

    public BalanceSheet() {
        balances = new HashMap<>();
    }

    public void addBalance(String paidBy, String owedTo, double amount) {
        balances.putIfAbsent(paidBy, new HashMap<>());
        balances.putIfAbsent(owedTo, new HashMap<>());

        balances.get(paidBy).put(owedTo, balances.get(paidBy).getOrDefault(owedTo, 0.0) + amount);
        balances.get(owedTo).put(paidBy, balances.get(owedTo).getOrDefault(paidBy, 0.0) - amount);
    }

    public void printBalances() {
        for (String user : balances.keySet()) {
            for (Map.Entry<String, Double> entry : balances.get(user).entrySet()) {
                if (entry.getValue() > 0) {
                    System.out.println(user + " owes " + entry.getKey() + ": " + entry.getValue());
                }
            }
        }
    }
}

