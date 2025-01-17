package BaiTapThayTrinh;

import java.util.Scanner;

public class Execise_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int num : array) {
            if (num < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = num;
            } else if (num < secondSmallest && num != firstSmallest) {
                secondSmallest = num;
            }
        }
        
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element in the array.");
        } else {
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        }
        
        scanner.close();
    }
}

