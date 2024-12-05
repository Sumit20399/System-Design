package designs.splitwise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();

        User user1 = new User("U1", "Alice", "alice@example.com", "1234567890");
        User user2 = new User("U2", "Bob", "bob@example.com", "1234567891");

        manager.addUser(user1);
        manager.addUser(user2);

        // Create an Equal Split Expense
        List<Split> splits = new ArrayList<>();
        splits.add(new EqualSplit(user1));
        splits.add(new EqualSplit(user2));

        Expense expense = new EqualExpense("E1", 1000, user1, splits, null);
        manager.addExpense(expense); // SplitType will be validated

        manager.showBalances();
    }
}
