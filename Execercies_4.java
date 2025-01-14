
package javaapplication1;

import java.util.Scanner;

public class Execercies_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (1-7) : ");
        int days = scanner.nextInt();
        String dayName;
        switch(days){
        case 1:
            dayName = "Sunday";
            break;
        case 7:
            dayName = "Saturday";
            break;
        case 6:
            dayName = "Friday";
            break;
        case 5: 
            dayName = "Thursday";
            break;
        case 4: 
            dayName = "Wednesday";
            break;
        case 3:
            dayName = "Tuesday";
            break;
        case 2:
            dayName = "Monday";
            break;
        default:
            dayName = "Error!pleass Enter number 1-7!";
            break;
    }
        System.out.println(dayName);
       
    }
    
}

