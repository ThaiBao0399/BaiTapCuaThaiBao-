
package Ecercise2;


public class Cat extends Animal{
    String color;

    public void makeSound() {
        System.out.println("Meow Meow!");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}

