import java.util.Scanner;

class BankAccount{
    String  accountHolder;
    int accountNumber;
    float  balance;

    public BankAccount(String accountHolder,int accountNumber,float balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositMoney(float depositAmount){
        balance += depositAmount;
    }

    public void withdrawMoney(float withdrawAmount){
        if ( balance > withdrawAmount){
            balance -= withdrawAmount;
        }
        else{
            System.out.println("You do not have a sufficient balance to withdraw");
        }
    }

    public void displayDetails(){
        System.out.println("Bank Account Details");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}

public class Program2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Holder : ");
        String  accountHolder = input.nextLine();
       
        System.out.print("Enter Student Account Number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter Balance : ");
        float balance = input.nextFloat();

        System.out.print("Enter Deposit Amount : ");
        float depositAmount = input.nextFloat();

        System.out.print("Enter Withdraw Amount : ");
        float withdrawAmount = input.nextFloat();

        BankAccount bankAccountRecord = new BankAccount(accountHolder,accountNumber,balance);
        bankAccountRecord.depositMoney(depositAmount);
        bankAccountRecord.withdrawMoney(withdrawAmount);
        bankAccountRecord.displayDetails();
    }
}
