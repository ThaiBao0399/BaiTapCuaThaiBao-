package javaapplication1;


import java.util.Scanner;

public class Excercise_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("is even number!");
        } else {
            System.out.println("is odd number!");
        }
    }

}