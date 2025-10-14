

// Abstraction
public abstract class Bank {
    // Final variable
    public final String BANK_CODE = "BANK123";

    // Abstract method
    public abstract void displayBankName();

    // Concrete method
    public void bankRules() {
        System.out.println("1. Maintain minimum balance.\n2. Do not share your PIN.\n");
    }

    // Final method
    public final void showBankPolicy() {
        System.out.println("Bank Policy: Customer information is confidential.\n");
    }
}
