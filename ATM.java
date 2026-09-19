package OOps;

public class ATM {

    double balance = 5000;

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);

        } else {

            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {

        ATM a = new ATM();

        a.checkBalance();

        a.withdraw(2000);

        a.checkBalance();
    }
}