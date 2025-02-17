package Ecercise2;

public class Dog extends Animal {
    String breed;

   
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
    
}

