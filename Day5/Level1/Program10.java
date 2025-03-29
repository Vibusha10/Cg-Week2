import java.util.Scanner;

class Person{
    String name;
    int id;
    
    public Person(String name,int id){
        this.name = name;
        this.id = id;
    }
    
    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + id);
    }
}

interface Worker{
    void  performDuties();
}

class  Chef extends Person implements Worker{
    
    public Chef(String name,int id){
        super(name,id);
    }
    
    public void performDuties(){
        System.out.println("Duties : Cooking");
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Role : Chef");
    }
}

class Waiter extends Person implements Worker{
    
    public Waiter(String name,int id){
        super(name,id);
    }
    
    public void performDuties(){
        System.out.println("Duties : Serving");
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Role : Waiter");
    }
}

public class Program10 {
    public static void main(String[] args) {
        System.out.println("CHEF");
        Chef chef = new Chef("Gordon", 101);
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\nWAITER");
        Waiter waiter = new Waiter("Emily", 202);
        waiter.displayDetails();
        waiter.performDuties();
    }
}