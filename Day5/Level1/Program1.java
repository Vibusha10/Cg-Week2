import java.util.Scanner;

class Animal{
    String name;
    int age;
    
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println(name + " is " + age + " years old and makes a sound.");
    }
}

class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println(name + " is " + age + " years old and says: Woof!");
    }
}

class Cat extends Animal{
    public Cat(String name,int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println(name + " is " + age + " years old and says: Meow!");
    }
}

class Bird extends Animal{
    public Bird(String name,int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println(name + " is " + age + " years old and says: Tweet!");
    }
}

public class Program1{
    public static void main(String[] args){
        Animal myPet = new Animal("Dog",4);
        myPet.makeSound();

        Animal myDog = new Dog("Buddy", 5);
        myDog.makeSound();

        Animal myCat = new Cat("Whiskers", 3);
        myCat.makeSound();

        Animal myBird = new Bird("Tweety", 2);
        myBird.makeSound();
    }
}