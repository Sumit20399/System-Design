package designs.splitwise;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<User> users;
    private BalanceSheet balanceSheet;

    public ExpenseManager() {
        this.users = new ArrayList<>();
        this.balanceSheet = new BalanceSheet();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addExpense(Expense expense) {
        if (!expense.validate()) {
            throw new IllegalArgumentException("Invalid expense");
        }

        SplitType splitType = expense.getSplitType(); // Use SplitType for logic if needed
        System.out.println("Expense added with split type: " + splitType);

        List<Split> splits = expense.getSplits();
        double totalAmount = expense.getAmount();
        User paidBy = expense.getPaidBy();

        for (Split split : splits) {
            double amount = split.getAmount();
            balanceSheet.addBalance(paidBy.getUserId(), split.getUser().getUserId(), amount);
        }
    }

    public void showBalances() {
        balanceSheet.printBalances();
    }
}
