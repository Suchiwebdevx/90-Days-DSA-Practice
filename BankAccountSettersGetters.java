/*Create a BankAccount class with:

accountHolder
accountNumber
balance

Requirements:

Make all variables private.
Create getters and setters.
Create displayAccountDetails().
Create an object in main().*/

package OOps;

import java.util.Scanner;

public class BankAccountSettersGetters {
	
	private String accountholder;
	private double accountNumber;
	private double balance;
	public String getAccountholder() {
		return accountholder;
	}
	public void setAccountholder(String accountholder) {
		this.accountholder = accountholder;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void displayDetails() {
      System.out.println("AccountHolder : " + accountholder);
      System.out.println("AccountNumber : " + accountNumber);
      System.out.println("Balance : " + balance);
	}
	public static void main (String args[]) {
		
		Scanner sc= new Scanner (System.in);
		
		BankAccountSettersGetters gs= new BankAccountSettersGetters();
		
		System.out.println("Enter your Name:");
		String accountholder =sc.nextLine();
		
		System.out.println("Enter Your AccountNumber:");
		double accountNumber= sc.nextDouble();
		
		System.out.println("Enter your Balance :");
		double balance=sc.nextDouble();
		
		//setters
		
		gs.setAccountholder(accountholder);
		gs.setAccountNumber(accountNumber);
		gs.setBalance(balance);
		
		gs.displayDetails();
		
	}
	void displayDetails1() {
		
		System.out.println("AccountHolder name : " + getAccountholder());
		System.out.println("AccountNumber of user  : " + getAccountNumber());
		System.out.println("User Balance : " + getBalance());
	}

}
