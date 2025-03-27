class BankAccount {
    static String bankName; 
    final int accountNumber;
    String accountHolderName;
    static int totalAccount = 0 ;

    public BankAccount(int accountNumber,String accountHolderName,String bankName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        totalAccount += 1 ;
    }

    public static void  getTotalAccounts(){
        System.out.println("\nTotal Account : " + totalAccount);        
    }

    public void displayDetails(){
        System.out.println("\nBank Account : ");
        System.out.println("Bank Name : " + bankName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
    }
}

public class Program1 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(123,"Anu","SBI");
        b1.displayDetails();

        BankAccount b2 = new BankAccount(124,"Banu","ICICI"); 
        b2.displayDetails();

         BankAccount.getTotalAccounts();     
                
        System.out.println("Is it a instance : " + (b1 instanceof BankAccount));
    }
}