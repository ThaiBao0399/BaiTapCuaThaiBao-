
package javaapplication1;

import java.util.Scanner;

public class Exercies_6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter kWh number: ");
        float e = scanner.nextFloat();

        if (e > 0 && e < 50) {
            System.out.println("The electric bill: " + e * 1.678 + "VND");
        } else if (e >= 51 && e < 100) {
            System.out.println("The electric bill: " + e * 1.734 + "VND");
        } else if (e >= 101 && e < 200) {
            System.out.println("The electric bill: " + e * 2.014 + "VND");
        } else {
            System.out.println("The electric bill: " + e * 2.536 + "VND");
        }

    }
}
