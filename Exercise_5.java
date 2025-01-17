package baitapthaytrinh;
import java.util.Arrays;
public class Exercise_5 {
    public static void main(String[] args) {
        int[] inputArray = {5, 2, 8, 1, 3};
        sortArray(inputArray);
        
        System.out.println("Input: [5, 2, 8, 1, 3]");
        System.out.println("Output: " + Arrays.toString(inputArray));
    }
    public static void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

