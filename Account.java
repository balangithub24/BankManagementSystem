// Inheritance: Base class
public class Account extends Bank {
    protected Customer customer;  // Protected access
    protected double balance;

    // Constructor
    public Account(Customer customer) {
        this.customer = customer;
        this.balance = customer.getBalance();
    }

    // Method to deposit (Overloading)
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void deposit(double amount, String note) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Note: " + note);
    }

    // Method to display balance
    public void showBalance() {
        System.out.println(customer.getName() + "'s Balance: " + balance);
    }

    // Polymorphism (will be overridden)
    public double calculateInterest() {
        return 0;
    }

    // Implement abstract method
    @Override
    public void displayBankName() {
        System.out.println("Welcome to Java Bank!");
    }
}
