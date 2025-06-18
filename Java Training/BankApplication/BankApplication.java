package BankApplication;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

// Transaction class
class Transaction {
    String type;
    double amount;
    Date timestamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = new Date();
    }

    public String toString() {
        return type + " of Rs" + amount + " on " + timestamp;
    }
}

// Loan class
class Loan {
    String type;
    double principal;
    double interestRate;
    double totalPayable;
    double paidAmount;

    public Loan(String type, double principal, double interestRate) {
        this.type = type;
        this.principal = principal;
        this.interestRate = interestRate;
        this.totalPayable = principal + (principal * interestRate / 100);
        this.paidAmount = 0;
    }

    public void pay(double amount) {
        this.paidAmount += amount;
    }

    public double getRemainingAmount() {
        return totalPayable - paidAmount;
    }

    public String toString() {
        return type + " Loan | Principal: Rs" + principal + " | Interest: " + interestRate + "% | Total Payable: Rs" + totalPayable + " | Paid: Rs" + paidAmount + " | Remaining: Rs" + getRemainingAmount();
    }
}

// Account class
class Account {
    private String name;
    private int accountNumber;
    private double balance;
    private String pin;
    private List<Transaction> transactions;
    private List<Loan> loans;

    public Account(String name, int accountNumber, String pin) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

     public void saveData(){

        File BankFile = new File("BankFile.txt");

        if(BankFile.exists())
        {
            try {
                FileWriter writeFile = new FileWriter("BankFile.txt"); 
                writeFile.write(name);
                writeFile.write(accountNumber);
                writeFile.write(pin);
                // writeFile.write(balance);
                // writeFile.write(loans);
                // writeFile.write(transactions);

                writeFile.close();
                

            } catch (Exception e) {

            }

        }
     }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    private boolean verifyPin(Scanner sc) {
        System.out.print("Enter your 4-digit PIN: ");
        String entered = sc.next();
        return entered.equals(pin);
    }

    public void deposit(double amount, Scanner sc) {
        if (!verifyPin(sc)) {
            System.out.println("Incorrect PIN. Transaction cancelled.");
            return;
        }
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Rs" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount, Scanner sc) {
        if (!verifyPin(sc)) {
            System.out.println("Incorrect PIN. Transaction cancelled.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
            System.out.println("Rs" + amount + " withdrawn successfully.");
        }
    }

    public void applyLoan(String type, double amount, double rate, Bank bank, Scanner sc) {
        if (!verifyPin(sc)) {
            System.out.println("Incorrect PIN. Loan request cancelled.");
            return;
        }
        double totalPayable = amount + (amount * rate / 100);
        if (bank.grantLoan(amount)) {
            balance += amount;
            Loan loan = new Loan(type, amount, rate);
            loans.add(loan);
            transactions.add(new Transaction(type + " Loan credited", amount));
            System.out.println("Loan approved! Total payable (with interest): Rs" + totalPayable);
        } else {
            System.out.println("Bank does not have enough funds to grant loan.");
        }
    }

    public void payLoan(Scanner sc) {
        if (loans.isEmpty()) {
            System.out.println("You have no active loans.");
            return;
        }
        System.out.println("Active Loans:");
        for (int i = 0; i < loans.size(); i++) {
            System.out.println((i + 1) + ". " + loans.get(i));
        }
        System.out.print("Choose a loan to repay (number): ");
        int index = sc.nextInt() - 1;
        if (index >= 0 && index < loans.size()) {
            Loan loan = loans.get(index);
            System.out.print("Enter amount to pay: Rs");
            double amt = sc.nextDouble();

            if (!verifyPin(sc)) {
                System.out.println("Incorrect PIN. Payment cancelled.");
                return;
            }

            if (amt > balance) {
                System.out.println("Insufficient balance. Please deposit money first.");
            } else {
                balance -= amt;
                loan.pay(amt);
                transactions.add(new Transaction("Loan Repayment (" + loan.type + ")", amt));
                System.out.println("Payment of Rs" + amt + " successful. Remaining: Rs" + loan.getRemainingAmount());

                if (loan.getRemainingAmount() <= 0) {
                    System.out.println(loan.type + " loan fully paid off.");
                    loans.remove(index);
                }
            }
        } else {
            System.out.println("Invalid loan selection.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: Rs" + balance);
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

    public void showLoans() {
        if (loans.isEmpty()) {
            System.out.println("No active loans.");
        } else {
            System.out.println("Your Loans:");
            for (Loan l : loans) {
                System.out.println(l);
            }
        }
    }
}

// Bank class
class Bank {
    private double totalFunds;
    private Map<Integer, Account> accounts;

    public Bank(double initialFunds) {
        this.totalFunds = initialFunds;
        this.accounts = new HashMap<>();
    }

    public boolean grantLoan(double amount) {
        if (amount <= totalFunds) {
            totalFunds -= amount;
            return true;
        }
        return false;
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account authenticate(int accountNumber, String pin) {
        Account acc = accounts.get(accountNumber);
        if (acc != null && acc.validatePin(pin)) {
            return acc;
        }
        return null;
    }
}

// Main class
public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Bank bank = new Bank(1000000); // Initial bank funds

        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Bank!");
            System.out.println("1. Create New Account");
            System.out.println("2. Login to your Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();

                    String pin;
                    while (true) {
                        System.out.print("Create 4-digit PIN: ");
                        pin = sc.nextLine();
                        if (pin.matches("\\d{4}")) break;
                        System.out.println("Invalid PIN. Please enter exactly 4 digits.");
                    }

                    int accNum = 100000 + rand.nextInt(900000);
                    Account newAcc = new Account(name, accNum, pin);
                    bank.addAccount(newAcc);
                    System.out.println("Account created! Your account number is: " + accNum);
                    break;

                case 2:
                    System.out.print("Enter your account number: ");
                    int accInput = sc.nextInt();
                    System.out.print("Enter your 4-digit PIN: ");
                    String pinInput = sc.next();
                    Account acc = bank.authenticate(accInput, pinInput);
                    if (acc != null) {
                        System.out.println("Login successful. Welcome, " + acc.getName() + "!");
                        runAccountMenu(sc, acc, bank);
                    } else {
                        System.out.println("Invalid credentials.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the bank. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }

    public static void runAccountMenu(Scanner sc, Account acc, Bank bank) {
        int choice;
        do {
            System.out.println("\n--- Account Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Apply for Loan");
            System.out.println("6. Pay Loan");
            System.out.println("7. View My Loans");
            System.out.println("8. Logout");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: Rs");
                    double dep = sc.nextDouble();
                    acc.deposit(dep, sc);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: Rs");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd, sc);
                    break;
                case 3:
                    acc.checkBalance();
                    break;
                case 4:
                    acc.showTransactionHistory();
                    break;
                case 5:
                    System.out.println("Loan Types:");
                    System.out.println("1. Gold Loan (7%)");
                    System.out.println("2. Home Loan (8%)");
                    System.out.println("3. Personal Loan (10%)");
                    System.out.print("Select loan type: ");
                    int loanType = sc.nextInt();
                    System.out.print("Enter loan amount: Rs");
                    double amt = sc.nextDouble();

                    switch (loanType) {
                        case 1:
                            acc.applyLoan("Gold", amt, 7, bank, sc);
                            break;
                        case 2:
                            acc.applyLoan("Home", amt, 8, bank, sc);
                            break;
                        case 3:
                            acc.applyLoan("Personal", amt, 10, bank, sc);
                            break;
                        default:
                            System.out.println("Invalid loan type.");
                    }
                    break;
                case 6:
                    acc.payLoan(sc);
                    break;
                case 7:
                    acc.showLoans();
                    break;
                case 8:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);
    }
}
