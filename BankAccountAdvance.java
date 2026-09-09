

package OOps;

public class BankAccountAdvance {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    // Getter and Setter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter and Setter for accountNumber
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Display details
    void displayAccountDetails() {
        System.out.println("Account Holder : " + getAccountHolder());
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Balance : " + getBalance());
    }

    public static void main(String args[]) {

        BankAccountAdvance bank = new BankAccountAdvance();

        bank.setAccountHolder("Amit");
        bank.setAccountNumber(123456);
        bank.setBalance(25000);

        System.out.println("Before Deposit:");
        bank.displayAccountDetails();

        bank.deposit(5000);

        System.out.println("\nAfter Deposit:");
        bank.displayAccountDetails();
    }
}