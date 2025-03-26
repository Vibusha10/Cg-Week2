import java.util.Scanner;

class  MobilePhone{

    String  brand;
    String model;
    int price;

    public  MobilePhone(String brand,String model,int price){
        this.brand = brand;
        this.model = model;
        this.price = price; 
    }

    public void displayDetails(){
        System.out.println("\nMobile Phone Details");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    } 
}

public class Program5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mobile Phone Brand1: ");
        String brand1 = input.nextLine();
        
        System.out.print("Enter Mobile Phone Model1: ");
        String model1 = input.nextLine();

        System.out.print("Enter Mobile Phone Price1: ");
        int Price1 = input.nextInt();

        MobilePhone  mobilePhoneRecord1 = new MobilePhone(brand1,model1,Price1);
        mobilePhoneRecord1.displayDetails(); 

        input.nextLine();

        System.out.print("Enter Mobile Phone Brand2: ");
        String brand2 = input.nextLine();
        
        System.out.print("Enter Mobile Phone Model2: ");
        String model2 = input.nextLine();

        System.out.print("Enter Mobile Phone Price2: ");
        int Price2 = input.nextInt();

        MobilePhone  mobilePhoneRecord2 = new MobilePhone(brand2,model2,Price2);
        mobilePhoneRecord2.displayDetails();
    }
}