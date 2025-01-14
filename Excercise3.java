package javaapplication1;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " not is leap year");
        }
    }

    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

