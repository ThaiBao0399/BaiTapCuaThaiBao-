
package javaapplication1;

import java.util.Scanner;

public class Exercies_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        
        System.out.println("The largest number is: " + max);
    }
}

