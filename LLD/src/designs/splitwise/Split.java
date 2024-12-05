package designs.splitwise;

public abstract class Split {
    private User user;

    public Split(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public abstract double getAmount();
}

class EqualSplit extends Split {
    public EqualSplit(User user) {
        super(user);
    }

    @Override
    public double getAmount() {
        return 0; // Will be set later
    }
}

class ExactSplit extends Split {
    private double amount;

    public ExactSplit(User user, double amount) {
        super(user);
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}

class PercentageSplit extends Split {
    private double percentage;

    public PercentageSplit(User user, double percentage) {
        super(user);
        this.percentage = percentage;
    }

    @Override
    public double getAmount() {
        return 0; // Will be set later
    }

    public double getPercentage() {
        return percentage;
    }
}
