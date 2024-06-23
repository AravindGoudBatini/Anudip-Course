package Lab_11;
import java.util.Scanner;

interface BankingInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankingInterface {
    private double balance;

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to savings account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from savings account.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class CurrentAccount implements BankingInterface {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to current account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from current account.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        BankingInterface savings = new SavingsAccount();
        BankingInterface current = new CurrentAccount();

        System.out.println("Enter Savings account Deposit Amount");
        double savingDeposit=sc.nextDouble();
        System.out.println("Enter Savings account Withdraw Amount");
        double savingWithdraw=sc.nextDouble();

        savings.deposit(savingDeposit);
        savings.withdraw(savingWithdraw);
        
        System.out.println("Enter Current account Deposit Amount");
        double currentDeposit=sc.nextDouble();
        System.out.println("Enter Current account Deposit Amount");
        double currentWithdraw=sc.nextDouble();

        current.deposit(currentDeposit);
        current.withdraw(currentWithdraw);

        System.out.println("Savings Account Balance: " + savings.getBalance());

        System.out.println("Current Account Balance: " + current.getBalance());
    }
}

