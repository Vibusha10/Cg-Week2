import java.util.Scanner;

class BankAccount{

    public int accountNumber;
    protected String accountHolder;
    private int balance;

    public BankAccount(int accountNumber,String accountHolder,int balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setbalance(int balance){
        if (balance > 0){
            this.balance = balance;
        }
        else{
            System.out.println("Invalid balance");
        }
    }

    public int getbalance(){
        return balance;
    }

    public void displayDetails(){
        System.out.println("\nBank Account Details : ");
        System.out.println("Account Number : "  + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}

class  SavingsAccount extends BankAccount{

    public SavingsAccount(int accountNumber,String accountHolder,int balance){
        super(accountNumber,accountHolder,balance);
    }

    public void displaySavingsAccountDetails(){
        System.out.println("\nSavingsAccount Details : ");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + getbalance());
    }    
}

public class Program3{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(101, "Alice", 40000);
        b1.displayDetails();

        SavingsAccount s1 = new SavingsAccount(102, "Bob", 30000);
        s1.displaySavingsAccountDetails();

        s1.setbalance(20000);
        System.out.println("\nUpdated balance : " + s1.getbalance());
    }
}