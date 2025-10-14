public class Main {
    public static void main(String[] args) {
        // Create Customer objects
        Customer c1 = new Customer("Balan", 101, 5000);
        Customer c2 = new Customer("Arun", 102, 8000);

        // Upcasting - Polymorphism
        Account acc1 = new SavingsAccount(c1);
        Account acc2 = new CurrentAccount(c2);

        // Display Bank info
        acc1.displayBankName();
        acc1.bankRules();
        acc1.showBankPolicy();

        // Deposit using method overloading
        acc1.deposit(2000);
        acc1.deposit(1000, "Salary Credit");

        // Calculate interest (runtime polymorphism)
        acc1.calculateInterest();
        acc2.calculateInterest();

        // Show balance
        acc1.showBalance();
        acc2.showBalance();

        // Interface demonstration
        SavingsAccount sa = (SavingsAccount) acc1;
        sa.applyLoan(50000);
    }
}

