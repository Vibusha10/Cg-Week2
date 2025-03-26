import java.util.Scanner;

class Person{
    
    String name;
    int age;
    
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }
    
    public void displayDetails(){
        System.out.println("\nPerson Details : ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Program3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name of the person : ");
        String name = input.nextLine();
        
        System.out.print("Enter age of the person : ");
        int age = input.nextInt();
        
        Person details1 = new Person(name,age);
        details1.displayDetails();
        
        System.out.println("\nCopied Details");
        Person details2 = new Person(details1);
        details2.displayDetails();
    }
}