import java.util.Scanner;

class BankAccount{
    int accountNumber;
    float balance;
    
    public BankAccount(int accountNumber,float balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void displayDetails(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}

class SavingsAccount extends BankAccount{
    int interestRate;
    
    public SavingsAccount(int accountNumber,float balance,int interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    
    public void displayAccountType(){
        System.out.println("Account Type : Savings");
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Interest Rate : " + interestRate);
    }
}

class CheckingAccount extends BankAccount{
    float  withdrawalLimit;
    public CheckingAccount(int accountNumber,float balance,float  withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    
    public void displayAccountType(){
        System.out.println("Account Type : Checkings");
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Withdrawal Limit : " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount{
    int maturityYears;
    
    public FixedDepositAccount(int accountNumber,float balance,int maturityYears){
        super(accountNumber,balance);
        this.maturityYears = maturityYears;
    }
    
    public void displayAccountType(){
        System.out.println("Account Type : Fixed Deposit");
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Maturity Years : " + maturityYears);
    }
}

public class Program8 {
    public static void main(String[] args) {
        System.out.println("SAVINGS ACCOUNT");
        SavingsAccount sa = new SavingsAccount(123, 1500f, 4);
        sa.displayAccountType();
        sa.displayDetails();

        System.out.println("\nCHECKING ACCOUNT");
        CheckingAccount ca = new CheckingAccount(456, 2500f, 1000);
        ca.displayAccountType();
        ca.displayDetails();

        System.out.println("\nFIXED DEPOSIT ACCOUNT");
        FixedDepositAccount fda = new FixedDepositAccount(789, 5000f, 12);
        fda.displayAccountType();
        fda.displayDetails();
    }
}