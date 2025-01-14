package javaapplication1;

import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the score of Math: ");
        double a = scanner.nextDouble();
        System.out.print("Input the score of Physics: ");
        double b = scanner.nextDouble();
        System.out.print("Input the score of Chemistry: ");
        double c = scanner.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println("Average score of three subjects: " + average);
        if (average >= 8 && average < 10) {
            System.out.println("Excellent");
        } else if (average >= 6.5 && average < 9{
            System.out.println("Good");
        } else if (average >= 5 && average < 6.5) {
            System.out.println("Average");
        } else if (average < 5 && average > 0) {
            System.out.println("Poor");
        }

    }

}