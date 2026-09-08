/*Check BankAccount with the properties:

Properties:

accountNumber
name
balance

Methods:

deposit()
withdraw()
displayBalance()*/

package OOps;

public class BankAccountClass {
	
	String accountNumber;
    String name;
    double balance;
    
	void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Deposited: " + amount);
		
	}
		
		void withdraw(double amount) {
			if(amount<=balance) {
				balance = balance - amount;
				System.out.println("Withdrawl " + amount);
			}else {
				System.out.println("INSUFFICIENT Amount");
			
		}
		
		}
			
			void displayBalance() {
				System.out.println("Account Number " + accountNumber );
				System.out.println("Account Holder Name " + name );
				System.out.println("Total balance " + balance );	
	}
 
public class main{
	public static void main(String args[]) {
		
		BankAccountClass B = new BankAccountClass();
		
		B.accountNumber="1234556";
		B.name="Suchi";
		B.balance=50000;
		
		B.deposit(50000);
		
		B.withdraw(4000);
		
		B.displayBalance();
		
		
		
	}

}
}
