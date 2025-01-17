
package baitapthaytrinh;

import java.util.Scanner;

public class Execise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = scanner.nextInt();   
        int[] arr = new int[n];    
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }   
        reverseArray(arr);

      
        System.out.print("Mảng sau khi đảo ngược: ");
        printArray(arr);
        scanner.close();
    }

    static void reverseArray(int[] arr) {
        int left = 0; 
        int right = arr.length - 1; 

       
        while (left < right) {
       
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;          
            left++;
            right--;
        }
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

