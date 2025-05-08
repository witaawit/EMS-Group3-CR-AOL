package Solution;

// Salary.java
public class Salary {
    private final double amount;

    public Salary(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("%.2f", amount);
    }
}
