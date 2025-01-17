
package baitapthaytrinh;
    import java.util.Scanner;

public class Execise_6 {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);          
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();       
        int[] array = new int[n];        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }             
        System.out.println("The sum of all elements in the array is: " + sum);     
        scanner.close();
    }
}

