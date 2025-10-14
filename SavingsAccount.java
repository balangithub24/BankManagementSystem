// Derived class + implements interface
public class SavingsAccount extends Account implements Loan {

    // Constructor using 'super'
    public SavingsAccount(Customer customer) {
        super(customer);
    }

    // Override calculateInterest
    @Override
    public double calculateInterest() {
        double interest = balance * 0.05; // 5% interest
        System.out.println("Savings Account Interest: " + interest);
        return interest;
    }

    // Implement interface method
    @Override
    public void applyLoan(double amount) {
        System.out.println("Loan of Rs." + amount + " applied for Savings Account.");
    }
}
