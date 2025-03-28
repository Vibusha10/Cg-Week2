import java.util.*;

class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Account openAccount(Customer customer, double initialDeposit) {
        Account newAccount = new Account(this, customer, initialDeposit);
        accounts.add(newAccount);
        customer.addAccount(newAccount);
        return newAccount;
    }

    public void listAccounts() {
        System.out.println("Accounts at " + name + ":");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalances() {
        System.out.println("Accounts for " + name + ":");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public String getName() {
        return name;
    }
}

class Account {
    private static int counter = 1000;
    private int accountNumber;
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double initialDeposit) {
        this.accountNumber = counter++;
        this.bank = bank;
        this.customer = customer;
        this.balance = initialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account #" + accountNumber + ", Bank: " + bank.getName() + ", Balance: $" + balance;
    }
}

public class Program2 {
    public static void main(String[] args) {
        Bank bank1 = new Bank("City Bank");
        Bank bank2 = new Bank("National Bank");

        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        bank1.openAccount(alice, 1500);
        bank1.openAccount(bob, 1200);
        bank2.openAccount(alice, 3000);

        alice.viewBalances();
        bob.viewBalances();

        bank1.listAccounts();
        bank2.listAccounts();
    }
}
