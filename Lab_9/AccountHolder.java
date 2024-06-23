package Lab_9;

import java.util.Scanner;

class BankAccount{
	String accountNo;
	String accounttype;
	double balance;
	public BankAccount(String accounttype) {
        this.accounttype = accounttype;
        this.balance = balance;
    }
	 BankAccount(String accountNo,String accounttype,double balance){
		 this.accountNo=accountNo;
		 this.accounttype=accounttype;
		 this.balance=balance;
	 }
	  public void deposit(double amount) {
	        balance=balance+amount;
	        System.out.println("Deposit of " + amount );
	    }

	    public void deposit(double amount, String deposittype) {
	        balance=balance+amount;
	        System.out.println("Deposit of " + amount + " by " + deposittype);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance=balance-amount;
	            System.out.println("Withdrawal " + amount );
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	    public double checkBalance() {
	        return balance;
	    }
	}


public class AccountHolder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		BankAccount savings = new BankAccount("Savings");
        BankAccount check = new BankAccount("Checking");
        System.out.print("Enter deposit amount for savings account: ");
        double depositAmount = sc.nextDouble();
        savings.deposit(depositAmount);
        
      
        System.out.print("Enter deposit amount for checking account: ");
        depositAmount = sc.nextDouble();
        check.deposit(depositAmount);
        
        
        System.out.print("Enter withdrawal amount from savings account: ");
        double withdrawAmount = sc.nextDouble();
        savings.withdraw(withdrawAmount);
        

        System.out.print("Enter withdrawal amount from checking account: ");
        withdrawAmount = sc.nextDouble();
        check.withdraw(withdrawAmount);
        
      
        System.out.println("Savings Account Balance:" + savings.checkBalance());
        
      
        System.out.println("Check Account Balance:" + check.checkBalance());
        
        sc.close();

	}

}
