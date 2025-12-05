package solutions;

public class solution3 {
    //Create Class Account with data member as Balance. Create two constructors (no argument, and with argument) and perform following task
    //a. method to deposit the amount to the account o the account.
    //b. method to withdraw the amount from the account.
    //c. method to display the Balance.

    public static void main(String[] args)  {
        createClass();
    }

    //input - amount
    //output - 1000
    public static void createClass() {
    }
}

// Account class
class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0;
    }

    // Parameterized constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > this.balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + this.balance);
    }

    public static void main(String[] args) {
        // Create an account object using no-argument constructor
        Account account1 = new Account();
        account1.displayBalance();
        account1.deposit(1000);
        account1.displayBalance();
        account1.withdraw(500);
        account1.displayBalance();

        // Create an account object using parameterized constructor
        Account account2 = new Account(5000);
        account2.displayBalance();
        account2.deposit(2000);
        account2.displayBalance();
        account2.withdraw(3000);
        account2.displayBalance();
    }
}