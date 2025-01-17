
package baitapthaytrinh;

import java.util.Scanner;

public class Execise_10 {

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
        countEvenOdd(arr);
        scanner.close();
    }

    static void countEvenOdd(int[] arr) {
        int evenCount = 0; 
        int oddCount = 0;         
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++; 
            }
        }
        System.out.println("Số chẵn: " + evenCount);
        System.out.println("Số lẻ: " + oddCount);
    }
}
