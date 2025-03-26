import java.util.Scanner;

class Item{

    int itemCode;
    String itemname;
    int itemPrice;

    public Item(int itemCode,String itemname,int itemPrice){
        this.itemCode = itemCode;
        this.itemname = itemname;
        this.itemPrice =itemPrice; 
    }

    public void displayDetails(int  quantity){
        System.out.println("Employee Details");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemname);
        System.out.println("Item Price : " + itemPrice);
        System.out.println("Total Price for " + quantity + " Items : " + itemPrice * quantity);
    } 
}

public class Program4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Item Code : ");
        int itemCode = input.nextInt();

        System.out.print("Enter Item Name : ");
        String itemName = input.nextLine();

         input.nextLine();

        System.out.print("Enter Item Price : ");
        int  itemPrice = input.nextInt();

        System.out.print("Enter Item Quantity : ");
        int  quantity = input.nextInt();

        Item itemRecord = new  Item(itemCode , itemName, itemPrice);
        itemRecord.displayDetails(quantity); 
    }
}