package baitapthaytrinh;

 import java.util.Scanner;

public class Execise_3 {
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
       boolean isPalindrome = checkPalindrome(arr); 
        if (isPalindrome) {
            System.out.println("Mảng là đối xứng: True");
        } else {
            System.out.println("Mảng là đối xứng: False");
        }
        scanner.close();
    }
    static boolean checkPalindrome(int[] arr) {
        int left = 0; 
        int right = arr.length - 1;       
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
}

