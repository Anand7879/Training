package BankApplication;

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.*;

class Transaction{
     String type;
    double amount;
    Date timestamp;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
         this.timestamp = new Date();
    }

     public String toString() {
         return type + " of ₹" + amount + " on " + timestamp;
    }
}

class BankAccount{
      private String name;
    private int accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public BankAccount(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();    
    }

     public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));   
            System.out.println("Rupees " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount)
    {
         if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
            System.out.println("Rupees " + amount + " withdrawn successfully.");
        }
    }

     public void checkBalance() {
        System.out.println("Current balance: Rupees " + balance);
    }

     public void showTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }
    }

    public void showAccountDetails() {
        System.out.println("Welcome, " + name + "!");
        System.out.println("Your account number: " + accountNumber);
    }
}

public class BankApplication {

    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to Bank");
        System.out.print("Enter your name to create a new account: ");
        String name = sc.nextLine();

        Random r = new Random();

          int accountNumber = 100000 + r.nextInt(900000);  // random 6-digit number
        BankAccount account = new BankAccount(name, accountNumber);

        account.showAccountDetails();

        int choice;

        do{
             System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: R");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.showTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using the bank. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }while (choice!=5);

        
    }
    
}
