
package baitapthaytrinh;
import java.util.ArrayList;
import java.util.List;
public class Execise_11 {   
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        List<Integer> primeNumbers = findPrimeNumbers(arr);
        System.out.println(primeNumbers);
    }
    static List<Integer> findPrimeNumbers(int[] arr) {
        List<Integer> primes = new ArrayList<>();
        for (int num : arr) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }
    static boolean isPrime(int num) {
        if (num <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true; 
    }
}

