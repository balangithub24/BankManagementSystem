// Derived class
public class CurrentAccount extends Account {

    // Constructor using 'super'
    public CurrentAccount(Customer customer) {
        super(customer);
    }

    // Override calculateInterest
    @Override
    public double calculateInterest() {
        double interest = balance * 0.02; // 2% interest
        System.out.println("Current Account Interest: " + interest);
        return interest;
    }
}
