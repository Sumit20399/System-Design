package designs.splitwise;

import java.util.List;

public abstract class Expense {
    private String expenseId;
    private double amount;
    private User paidBy;
    private List<Split> splits;
    private Group group;
    private SplitType splitType; // Add SplitType here

    public Expense(String expenseId, double amount, User paidBy, List<Split> splits, Group group, SplitType splitType) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.paidBy = paidBy;
        this.splits = splits;
        this.group = group;
        this.splitType = splitType;
    }

    public abstract boolean validate();

    public double getAmount() {
        return amount;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public SplitType getSplitType() {
        return splitType;
    }
}


class EqualExpense extends Expense {
    public EqualExpense(String expenseId, double amount, User paidBy, List<Split> splits, Group group) {
        super(expenseId, amount, paidBy, splits, group, SplitType.EQUAL);
    }

    @Override
    public boolean validate() {
        for (Split split : getSplits()) {
            if (!(split instanceof EqualSplit)) {
                return false; // Invalid split type
            }
        }
        return getSplits().size() > 0 && getAmount() > 0;
    }
}

class ExactExpense extends Expense {
    public ExactExpense(String expenseId, double amount, User paidBy, List<Split> splits, Group group) {
        super(expenseId, amount, paidBy, splits, group, SplitType.EXACT);
    }

    @Override
    public boolean validate() {
        double total = 0;
        for (Split split : getSplits()) {
            if (!(split instanceof EqualSplit)) {
                return false; // Invalid split type
            }
            total += split.getAmount();
        }
        return total == getAmount();
    }
}

class PercentageExpense extends Expense {
    public PercentageExpense(String expenseId, double amount, User paidBy, List<Split> splits, Group group) {
        super(expenseId, amount, paidBy, splits, group, SplitType.PERCENTAGE);
    }

    @Override
    public boolean validate() {
        double total = 0;
        for (Split split : getSplits()) {
            if (split instanceof PercentageSplit) {
                total += ((PercentageSplit) split).getPercentage();
            }
        }
        return total == 100;
    }
}

